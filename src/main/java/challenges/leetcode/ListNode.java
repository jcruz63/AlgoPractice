package challenges.leetcode;

import org.jetbrains.annotations.NotNull;

class ListNode{
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode listFromArray(int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            current.next = node;
            current = node;
        }
        return head;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }

        if(!(obj instanceof ListNode)){
            return false;
        }

        ListNode node = (ListNode) obj;
        ListNode temp = this;

        while (node != null){
            if(temp == null){
                return false;
            }
            if(node.val != temp.val){
                return false;
            }
            node = node.next;
            temp = temp.next;
        }

        return temp == null;
    }
}
