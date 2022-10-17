package challenges.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RmoveDuplicatesLinkedListTest {

    @Test
    void deleteDuplicates() {
        int[] sample = {1, 1, 2};
        ListNode head = ListNode.listFromArray(sample);
        int[] sampleWithRemoved = {1, 2};
        ListNode test = ListNode.listFromArray(sampleWithRemoved);

        assertEquals(test, RmoveDuplicatesLinkedList.deleteDuplicates(head));

    }
}