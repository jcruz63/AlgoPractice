import graph.NodeGraph;

public class Main {

    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {

//        GraphUsingMap graphUsingMap = new GraphUsingMap(5, false);
//        graphUsingMap.addEdge(1, 2);
//        graphUsingMap.addEdge(2, 3);
//        graphUsingMap.addEdge(1, 3);
//
//        System.out.println(graphUsingMap);
//
//        GraphUsingArrayList graphUsingArrayList = new GraphUsingArrayList(5, false);
//        graphUsingArrayList.addEdge(1, 2);
//        graphUsingArrayList.addEdge(2, 3);
//        graphUsingArrayList.addEdge(1,3);
//
//        System.out.println(graphUsingArrayList);
        NodeGraph nodeGraph = new NodeGraph(0);
        nodeGraph.addNode(0, 1);
        nodeGraph.addNode(0, 2);
        nodeGraph.addNode(0, 3);
        nodeGraph.addNode(2, 4);

        nodeGraph.breathFirstPrint();
    }
}
