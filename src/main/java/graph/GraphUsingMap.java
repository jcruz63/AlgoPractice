package graph;


import java.util.*;

public class GraphUsingMap {
    private int capacity;
    private boolean undirected;
    private Map<Integer, LinkedList<Integer>> vertices;

    public GraphUsingMap(int capacity, boolean undirected){
        this.capacity = capacity;
        this.undirected = undirected;
        vertices = new HashMap<>(capacity);
    }

    public void addEdge(int vertex, int val){
        if(vertices.containsKey(vertex)){
            vertices.get(vertex).add(val);
        }
        else {
            vertices.put(vertex, new LinkedList<>());
            vertices.get(vertex).add(val);
        }

        if(undirected){
            if(vertices.containsKey(val)){
                vertices.get(val).add(vertex);
            }
            else {
                vertices.put(val, new LinkedList<>());
                vertices.get(val).add(vertex);
            }
       }

    }


    @Override
    public String toString() {
        return "Graph{" +
                "capacity=" + capacity +
                ", undirected=" + undirected +
                ", vertices=" + vertices +
                '}';
    }
}
