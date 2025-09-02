package midTerm;

public class Q30_ReverseOfLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head; // Base case

        ListNode newHead = reverse(head.next); // Recursively reverse the rest
        head.next.next = head; // Make the next node point to the current node
        head.next = null; // Remove old link

        return newHead;
    }

    public ListNode reverseList(ListNode head) {
        return reverse(head);
    }

    // Helper function to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Q30_ReverseOfLinkedList obj = new Q30_ReverseOfLinkedList();

        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Reverse the linked list
        ListNode reversedHead = obj.reverseList(head);

        System.out.println("Reversed List:");
        printList(reversedHead);
        ListNode reversedHead2 = obj.reverseList(head);

    

    }
}
