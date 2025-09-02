package LinkedList;

public class LinkedListOperations {
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static int size(Node head){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    static void deleteNode(Node head){
        Node temp=head;
        while(temp.next.next!=null){
            temp.data=temp.next.data;
            temp=temp.next;
        }
        temp.data=temp.next.data;
        temp.next=null;
    }
    static Node dltNthLast(Node head,int n){
        Node temp=head;
        int size=size(head);
        for(int i=0;i<size-n;i++){
            temp=temp.next;
        }
        temp=temp.next;
        return temp;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node dltNth(Node head,int n){
        Node temp=head;
        if(n==1){
            head=head.next;
            return head;
        }
        if(temp.next==null){
            temp=null;
            return head;
        }
        for(int i=0;i<n;i++){
            temp=temp.next;
        }
        temp.data=temp.next.data;
        temp.next=temp.next.next;
        return head;
    }
    static Node dltNthLastInOne(Node head,int n){
        Node fast=head;
        Node slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    static Node rotate(Node head,int k){
        Node temp=head;
        while(temp.next!=null){
            temp.next=head;
            temp=temp.next;
        }
//        temp=head;
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
    //    display(a);
        // System.out.println(dltNthLast(a,3).data);
        // deleteNode(b);
        // display(a);
//        display(a);
        // dltNth(a,2);
//        System.out.println();
//        display(dltNth(a, 4));
//        System.out.println(dltNthLast(a, 3));
//        display(a);
        display(rotate(a,1));
    }
}
