package stack;

public class LLImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class Stack{
        Node head=null;
        private int size=0;
        void push(int val){
            Node temp=new Node(val);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val+ " ");
        }
        void display(){
            Node temp=head;
            displayRec(temp);
        }
        int pop(){
            int top=head.val;
            head=head.next;
            size--;
            return top;
        }
        int size(){
            return size;
        }
        int peek(){
            return head.val;
        }
        boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(100);
        st.display();
//        System.out.println("Size: "+st.size);
//        st.pop();
//        st.display();
//        System.out.println("Size: "+st.size);
//        System.out.println(st.peek());
/*

 */
    }
}
