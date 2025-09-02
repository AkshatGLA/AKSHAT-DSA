package midTerm;

public class Q35_MergeTwoSortedLinkedList {
    public static class ListNode {
        int val;
        ListNode next; // Fixed incorrect reference
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(-1); // Dummy node with a valid value
        ListNode dummy = temp;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                dummy.next = list1;
                list1 = list1.next;
            } else {
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy = dummy.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            dummy.next = list1;
        } else {
            dummy.next = list2;
        }

        return temp.next; // Return merged list starting from the first valid node
    }
}
