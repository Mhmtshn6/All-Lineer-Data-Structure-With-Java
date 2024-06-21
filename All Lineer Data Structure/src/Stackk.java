import java.util.Stack;

public class Stackk {  // Use the LIFO system. Last in First Out
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(); // Create Stack

        stack.push("Apple");
        stack.push("Samsung");
        stack.push("Xiaomi"); // Add Elements in Stack

        for (String item : stack) {
            System.out.println(item);
        } // Print Stack

        System.out.println("\nElement popped from the stack: " + stack.pop());
        // Pop an element from the Stack

        for (String item : stack) {
            System.out.println(item);
        } // Print Stack after popping

        System.out.println("\nElement at the top of the stack: " + stack.peek());
        // Peek at the top element of the Stack

        System.out.println("\nIs the stack empty? " + stack.isEmpty());
        // Check if the Stack is empty

    }
}
