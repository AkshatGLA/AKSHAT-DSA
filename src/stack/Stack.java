package stack;

public interface Stack <T> {
    public void push(T val);
    public T pop();
    public T peek();
    public boolean isEmpty();
}
