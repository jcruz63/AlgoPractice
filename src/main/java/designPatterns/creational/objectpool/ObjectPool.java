package designPatterns.creational.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    private final BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> supplier, int count){
        availablePool = new LinkedBlockingQueue<T>();
        for (int i = 0; i < count; i++) {
            availablePool.offer(supplier.get());
        }
    }

    public T get(){
        try {
            return availablePool.take();
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
        return null;
    }

    public void release(T obj){
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
