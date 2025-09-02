package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Basic {
    public static void display(Queue<Integer>q){
        Queue<Integer> tq=new LinkedList<>();
        while(!q.isEmpty()){
            int a=q.remove();
            System.out.print(a+" ");
            tq.add(a);
        }
        while(!tq.isEmpty()){
            q.add(tq.remove());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
//        Queue<Integer> q=new Queue<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println("First Element: "+q.element());
        System.out.println("First Element: "+q.peek());
        System.out.println("Size of q: "+q.size());
        System.out.println(q.isEmpty());
        display(q);
        System.out.println(q);

    }
}
