package midTerm;

class Q34_RemoveDuplicatesFromLinkedList { // Fixed class name typo
    public static class ListNode {
        int val;
        ListNode next; // Fixed incorrect reference
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next; // Remove duplicate
            } else {
                temp = temp.next; // Move forward if no duplicate
            }
        }
        return head;
    }
}
