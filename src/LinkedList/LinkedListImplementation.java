package LinkedList;

public class LinkedListImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }    
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        int size=0;
        int size(){
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                size++;
            }
            return size;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+ " ");
                temp=temp.next;
            }
            System.out.println();
        }
        void insertAtEnd(int val) {
            Node temp=new Node(val);
            if(head==null){
                tail=temp;
                head=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }
        void dltNode(int n){
            Node temp=head;
            if(n==size()){
                for(int i=0;i<n-2;i++){
                    temp=temp.next;
                }
                System.out.println(temp.data);
                temp.next=null;
                return;
            }
            if(n==0){
                head=head.next;
            }
            for(int i=0;i<n-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        void getAt(int idx){
            Node temp=head;
            if(idx>=size()){
                System.out.println("Index out of bound");
                return;
            }
            if(idx<0){
                System.out.println("Invalid Index");    
                return;
            }
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtHead(1);
        ll.insertAtHead(0);
        ll.display();
        ll.getAt(5);
    }
}
