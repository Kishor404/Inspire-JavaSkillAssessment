// 15) Implement a PriorityQueue in Java that stores a set of tasks with priorities. Use a custom Comparator to define the order of tasks. Demonstrate the use of add(), remove(), and peek() methods.

import java.util.PriorityQueue;

class Task {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String toString() {
        return name + " (priority " + priority + ")";
    }
}

public class Q15 {
    public static void main(String[] args) {
        PriorityQueue<Task> pq = new PriorityQueue<>(
                (t1, t2) -> Integer.compare(t1.priority, t2.priority)
        );

        pq.add(new Task("Do homework", 2));
        pq.add(new Task("Play game", 5));
        pq.add(new Task("Study Java", 1));

        System.out.println("Peek: " + pq.peek());

        while (!pq.isEmpty()) {
            System.out.println("Remove: " + pq.remove());
        }
    }
}
