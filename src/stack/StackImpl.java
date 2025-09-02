package stack;

public class    StackImpl <T> implements Stack <T>{
    T[] array;
    int top;
    StackImpl(int size){
        array=(T[]) new Object[size];
        top=-1;
    }

    public void push(T val) {
        if(top==array.length-1){
            throw new RuntimeException("Stack is overflow");
        }
        array[++top]=val;
    }

    public T pop() {
        if(isEmpty()){
            throw new RuntimeException("Stack is underflow");
        }
        return array[top--];
    }

    public T peek() {
        if(isEmpty()){
            throw new RuntimeException("Stack is overflow");
        }
        return array[top];
    }

    public boolean isEmpty() {
        return false;
    }

}
