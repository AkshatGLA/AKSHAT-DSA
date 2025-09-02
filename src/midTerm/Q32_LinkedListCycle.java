package midTerm;

public class Q32_LinkedListCycle {
    public static class ListNode {
        int val;
        ListNode next; // Fixed incorrect reference to Q30_ReverseOfLinkedList.ListNode
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) { // Fixed loop condition
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true; // Cycle detected
        }
        return false;
    }
}
