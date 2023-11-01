package Phase1Module3;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        // Pop element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        
        // Peek at the top element
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);
    }
}
