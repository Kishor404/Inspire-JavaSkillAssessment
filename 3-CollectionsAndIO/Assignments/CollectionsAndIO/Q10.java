// 10) Implement a stack data structure in Java using a linked list. The stack should have push, pop, and peek methods.

public class Q10 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    static class Stack {
        private Node top;

        public void push(int value) {
            Node node = new Node(value);
            node.next = top;
            top = node;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
