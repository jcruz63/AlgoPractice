package challenges.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergedTwoSortedListTest {

    @Test
    void mergeTwoLists() {
        int[] list1 = {1, 2, 4};
        int[] list2 = {1, 3, 4};
        int[] solution = {1, 1, 2, 3, 4, 4};

        ListNode nodeList1 = listFromArr(list1);
        ListNode nodeList2 = listFromArr(list2);
        ListNode nodeListCombined = listFromArr(solution);
        MergedTwoSortedList mergedTwoSortedList = new MergedTwoSortedList();

        assertTrue(compareTwoListNodes(nodeListCombined, mergedTwoSortedList.mergeTwoLists(nodeList1, nodeList2)));



    }

    ListNode listFromArr( int[] arr){
        ListNode head = null;
        ListNode current = null;

        for (int i = 0; i < arr.length; i++) {
            if(head == null) {
                head = new ListNode(arr[i]);
                current = head;
            } else {
                current.next = new ListNode(arr[i]);
                current = current.next;
            }
        }

        return head;
    }

    boolean compareTwoListNodes(ListNode list1, ListNode list2){
        try {
            ListNode current1 = list1;
            ListNode current2 = list2;

            while (current1 != null){
                if(current1.val != current2.val){
                    return false;
                }
                current1 = current1.next;
                current2 = current2.next;
            }
        }
        catch (NullPointerException exception){
            return false;
        }

        return true;
    }
}