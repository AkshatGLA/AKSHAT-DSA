package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Deq {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
//        add, remove/poll, peek/element
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.addFirst(6);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
    }
}
