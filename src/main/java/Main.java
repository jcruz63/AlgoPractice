import graph.GraphUsingMap;

public class Main {

    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {

        GraphUsingMap graphUsingMap = new GraphUsingMap(5, false);
        graphUsingMap.addEdge(1, 2);
        graphUsingMap.addEdge(2, 3);
        graphUsingMap.addEdge(1, 3);

        System.out.println(graphUsingMap.toString());
    }
}
