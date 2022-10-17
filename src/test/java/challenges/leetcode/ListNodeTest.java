package challenges.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    @Test
    void testEquals() {
        int[] sample = {1, 2, 3};
        ListNode node1 = ListNode.listFromArray(sample);
        ListNode node2 = ListNode.listFromArray(sample);

        assertEquals(node1,
                node2);
    }
}