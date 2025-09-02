package stack;

public class StackService {
    public static void main(String[] args) {
        Stack<String> stack=new StackImpl<>(2);
        stack.push("A");
        stack.push("B");
        stack.push("C");
    }
}
