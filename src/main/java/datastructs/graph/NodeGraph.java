package datastructs.graph;

import java.util.*;

public class NodeGraph {

    static class Node {

        private int value;
        private List<Node> children = new ArrayList<Node>();

        public Node(int value){
            this.value = value;
        }

        public void addChild(int value) {
            Node node = new Node(value);
            this.children.add(node);
        }

        public int getValue() {
            return value;
        }

        public List<Node> getChildren() {
            return children;
        }

    }

    private Node root;

    public NodeGraph(int root) {
        this.root = new Node(root);
    }

    public Node getRoot() {
        return root;
    }

    public boolean addNode(int parent, int value){
        Queue<Node> nodeQueue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()){

            Node currentNode = nodeQueue.poll();
            visited.add(currentNode.getValue());

            if(currentNode.getValue() == parent){
                currentNode.addChild(value);
                return true;
            }
            currentNode.children.forEach(node -> {
                if(!visited.contains(node.getValue())){
                    nodeQueue.add(node);
                }
            });
        }

        return false;
    }


    public void breathFirstPrint(){

        Queue<Node> nodeQueue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()){

            Node currentNode = nodeQueue.poll();
            System.out.print(currentNode.getValue());
            visited.add(currentNode.getValue());

            if(!currentNode.children.isEmpty()){
                System.out.print(" -> ");
                currentNode.children.forEach(node -> {
                    if(!visited.contains(node.getValue())){
                        System.out.print(node.value + ", ");
                        nodeQueue.add(node);
                    }
                });
            }
            System.out.println();

        }

    }
}
