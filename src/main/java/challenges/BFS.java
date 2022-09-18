package challenges;

import java.util.*;

public class BFS {
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> breadthFirstSearch(List<String> array) {
            // Write your code here.

            Queue<Node> nodeQueue = new LinkedList<>();
            nodeQueue.add(this);

            while (!nodeQueue.isEmpty()){
                Node node = nodeQueue.poll();
                array.add(node.name);
                nodeQueue.addAll(node.children);
            }

            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
