// Implement a stack data structure in Java using an array or a linked list. The stack should have push, pop, and peek methods.

class IntStack {
    private int[] data;
    private int top;

    public IntStack(int size) {
        data = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == data.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        data[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return data[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class Q4 {
    public static void main(String[] args) {
        IntStack stack = new IntStack(5);
        stack.push(10);
        stack.push(20);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
    }
}