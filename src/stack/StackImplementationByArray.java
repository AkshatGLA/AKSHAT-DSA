package stack;

public class StackImplementationByArray {
    public static class Stack{
        private int[]arr=new int[5];
        private int index=0;
        void push(int val){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[index]=val;
            index++;
        }
        int peek(){
            if(index==0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[index-1];
        }
        int pop(){
            if(index==0) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top=arr[index-1];
            arr[index-1]=0;
            index--;
            return top;
        }
        void display(){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return index;
        }
        boolean isFull(){
            if(index==arr.length){
                return true;
            }
            return false;
        }
        boolean isEmpty(){
            if(index==0){
                return true;
            }
            return false;
        }
        int capacit(){
            return arr.length;
        }

    }
    public static void main(String[] args) {
        Stack st=new Stack();
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
        st.push(2);
        st.push(4);
        st.push(100);
        st.push(11);
        st.push(14);
        System.out.println(st.isFull());

        st.display();
        System.out.println(st.size());
    }
}
