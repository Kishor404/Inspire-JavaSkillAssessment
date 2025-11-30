// 3) Implement a stack data structure in Java using an array. The stack should have push, pop, and peek methods.

public class Q3 {
    static class Stack {
        private int[] data;
        private int top;

        public Stack(int size) {
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
            if (isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }
            return data[top--];
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return data[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top after pop: " + stack.peek());
    }
}
