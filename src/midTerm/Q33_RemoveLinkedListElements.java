package midTerm;

public class Q33_RemoveLinkedListElements {
    public static class ListNode {
        int val;
        ListNode next; // Fixed incorrect reference
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next; // Skip the node with val
            } else {
                temp = temp.next; // Move forward only if no removal
            }
        }
        return head;
    }
}
