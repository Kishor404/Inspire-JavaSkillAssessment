// Implement a PriorityQueue in Java that stores a set of tasks with priorities. Use a custom Comparator to define the order of tasks. Demonstrate the use of add(), remove(), and peek() methods.

import java.util.PriorityQueue;

class Task {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " (priority " + priority + ")";
    }
}

public class Q8 {
    public static void main(String[] args) {
        PriorityQueue<Task> pq = new PriorityQueue<>(
                (t1, t2) -> Integer.compare(t1.priority, t2.priority)
        );

        pq.add(new Task("Task A", 3));
        pq.add(new Task("Task B", 1));
        pq.add(new Task("Task C", 2));

        System.out.println("Peek: " + pq.peek());
        while (!pq.isEmpty()) {
            System.out.println("Remove: " + pq.remove());
        }
    }
}
