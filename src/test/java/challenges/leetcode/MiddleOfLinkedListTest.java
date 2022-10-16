package challenges.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfLinkedListTest {

    private ListNode arrayToListNode(int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            current.next = node;
            current = node;
        }
        return head;
    }

    @Test
    void middleNode() {
        int[] setup = {1,2,3,4,5};
        ListNode head = arrayToListNode(setup);
        ListNode expected = head.next.next;
        assertEquals(expected, MiddleOfLinkedList.middleNode(head));

    }
}