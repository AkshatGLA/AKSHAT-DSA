package stack;

import java.util.Stack;

public class StackByUsingCollectionFramework {
//    print nth element in stack
    public static void printNth(Stack st,int k){
        while(st.size()>k){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
//    public static Stack<>
    public static Stack<Integer> displayReverse(Stack<Integer> st){
        Stack<Integer> ans=new Stack<>();
        while(st.size()>0){
            ans.push(st.pop());
        }
        return ans;
    }
    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int k){
        Stack<Integer> temp=new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        st.push(k);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        return st;
    }
    public static Stack<Integer> insertAt(Stack<Integer> st,int idx, int val){
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(val);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        return st;
    }
    public static Stack<Integer> copyStack(Stack<Integer> st){
        Stack<Integer> ans=new Stack<>();
        Stack<Integer> temp=new Stack<>();
        while(st.size()>0){
            temp.add(st.pop());
        }
        while(temp.size()>0){
            st.add(temp.pop());
        }
        return st;
    }
    public static void displayReverseRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        System.out.print(top+" ");
        display(st);
        st.push(top);
    }
    public static void display(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static Stack<Integer> removeAt(Stack<Integer>st, int idx){
        if(idx<0 || idx>=st.size()){
            throw new IllegalArgumentException("Index Out of Bound");
        }
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx+1){
            temp.push(st.pop());
        }
        st.pop();
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return st;
    }
    public static Stack<Integer> popBottom(Stack<Integer>st){
        Stack<Integer> temp=new Stack<>();
        while(st.size()>1){
            temp.push(st.pop());
        }
        st.pop();
        while(temp.size()>0){
            st.push(temp.pop());
        }
        return st;
    }
    public static void pushAtBottom(Stack<Integer> st, int val){
        Stack<Integer> temp=new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        st.push(val);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
    }
    public static void reverse(Stack<Integer> st) {
        if(st.size() == 1)return;
        int top=st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }
    /*
    Make a recursive function to push at bottom in the stack, reverse stack
     */

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

//        Insert Element into stack
        st.push(12);
        st.push(13);
        st.push(32);
        st.push(100);
        st.push(120);

//        System.out.println(st);
//        printNth(st,2);
//        System.out.println("Original Stack: "+st);
//        System.out.println("Copy Stack with 2 stack: "+copyStack(st));
//        System.out.println("Inserting at Bottom: "+ insertAtBottom(st,1000));
//        System.out.println("InsertAt index: "+ insertAt(st,3,11111));
//        System.out.println("Reverse Stack with 1 stack: "+reverse(st));
//        System.out.println();
        System.out.println(st);
//        removeAt(st,3);
//        popBottom(st);
//        removeAt(st,2);
        reverse(st);
        System.out.println(st);
//        display(st);
//        System.out.println();
//        displayReverse(st);
//        System.out.println();

//        print nth element in stack

        // remove element from stack
//        st.pop();
//        st.pop();
        
        // to check current topmost element
//        System.out.println(st.peek());
//        System.out.println(st.peek());

    }
}
