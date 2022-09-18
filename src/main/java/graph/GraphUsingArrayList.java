package graph;

import java.util.*;

public class GraphUsingArrayList {

    private int capacity;
    private boolean undirected;
    private ArrayList<Integer>[] list;

    public GraphUsingArrayList(int capacity, boolean undirected){
        this.capacity = capacity;
        this.undirected = undirected;
        list = new ArrayList[capacity];
        for(int i = 0; i < capacity; i++){
            list[i] = new ArrayList<>();
        }

    }

    public void addEdge(int parentVertex, int childVertex){
//        list[parentVertex].add(endVertex);
//        if(undirected){
//            list[endVertex].add(startVertex);
//        }
    }


    @Override
    public String toString() {
        return "GraphUsingArrayList{" +
                "capacity=" + capacity +
                ", undirected=" + undirected +
                ", list=" + Arrays.toString(list) +
                '}';
    }
}
