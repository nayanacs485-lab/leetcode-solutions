import java.util.*;

public class MinStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(2);

        System.out.println("Stack: " + stack);
        System.out.println("Minimum: " + Collections.min(stack));

        stack.pop();

        System.out.println("After pop: " + stack);
        System.out.println("Minimum: " + Collections.min(stack));
    }
}
