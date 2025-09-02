package midTerm;

public class Q27_InterSectionOfLinkedLisst { 
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public int size(ListNode head){
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int s1=size(temp1);
        int s2=size(temp2);
        temp1=headA;
        temp2=headB;
        if(s1>s2){
            for(int i=0;i<s1-s2;i++){
                temp1=temp1.next;
                // return temp1;
            }
        }else if(s2>s1){
            for(int i=0;i<s2-s1;i++){
                temp2=temp2.next;
                // return temp2;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}
