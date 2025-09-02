package Queue;
/*
Advanatage
- Unlimited size
- LL works like you you can see LL is similar to Queue

Disadvantge
- LL has two members
-
 */
public class LinkedListImplementation {
     public static class Node{
         int val;
         Node next;

         Node(int val){
             this.val=val;
         }
     }
     public static class QueueLL{
         Node head=null;
         Node tail=null;
         int size=0;

         public void add(int val){
             Node temp=new Node(val);
             if(size==0){
                 head=tail=temp;
             }else{
                 tail.next=temp;
                 tail=temp;
             }
             size++;
         }
         public int peek(){
             if(size==0){
                 System.out.println("Queue is Empty");
                 return -1;
             }
             return head.val;
         }
         public int remove(){
             if(size==0){
                 System.out.println("Queue is Empty");
                 return -1;
             }
             int x=head.val;
             head=head.next;
             size--;
             return x;
         }
         public void display(){
             Node temp=head;
             while(temp!=null){
                 System.out.print(temp.val+" ");
                 temp=temp.next;
             }
             System.out.println();
         }
         public boolean isEmpty(){
             if(size==0) return true;
             return false;
         }
     }
    public static void main(String[] args) {
         QueueLL q=new QueueLL();
         q.add(1);
         q.add(2);
         q.add(3);
         q.display();
        System.out.println(q.size);
         q.remove();
         q.display();
        System.out.println(q.size);
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
}
