package challenges.leetcode;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MergedTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        Map<Integer, ArrayList<ListNode>> nodes = new TreeMap<>();

        nodesToMap(list1,
                (Map<Integer, ArrayList<ListNode>>) nodes);

        nodesToMap(list2,
                (Map<Integer, ArrayList<ListNode>>) nodes);



        return mapToListNode(nodes);
    }

    private void nodesToMap(ListNode list2, Map<Integer, ArrayList<ListNode>> nodes) {
        for(ListNode node = list2; node != null; node = node.next){
            if(!nodes.containsKey(node.val)){
                ArrayList<ListNode> arr = new ArrayList<>();
                arr.add(node);
                nodes.put(node.val, arr);
            } else {
                nodes.get(node.val).add(node);
            }
        }
    }

    private ListNode mapToListNode(Map<Integer, ArrayList<ListNode>> nodes){
        ListNode head = null;
        ListNode current = null;

        for(Map.Entry<Integer, ArrayList<ListNode>> entry: nodes.entrySet()){
            for(ListNode node : entry.getValue()){
                if(head == null){
                    head = node;
                    current = head;
                } else {
                    current.next = node;
                    current = current.next;
                }
            }
        }
        System.out.println(head);

        return head;
    }
}
