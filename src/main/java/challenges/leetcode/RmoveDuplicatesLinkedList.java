package challenges.leetcode;

import java.util.HashSet;
import java.util.Set;

public class RmoveDuplicatesLinkedList {
    public static ListNode deleteDuplicates(ListNode head) {

        Set<Integer> unique = new HashSet<>();

        ListNode current = head;
        ListNode previous = null;
        int iteration = 1;

        while (current != null){
            if(unique.contains(current.val)){
                previous.next = current.next;
            } else {
                unique.add(current.val);
                previous = current;
            }
            current = current.next;

        }

        return head;
    }
}
