// 17) Implement a double linked list data structure with type safety . It should have methods to add, remove, print, get and sort elements in the list.

public class Q17<T extends Comparable<T>> {
    static class Node<T> {
        T data;
        Node<T> prev, next;

        Node(T d) {
            data = d;
        }
    }

    private Node<T> head;

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = node;
            return;
        }
        Node<T> temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = node;
        node.prev = temp;
    }

    public void remove(T value) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(value)) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    public T get(int index) {
        int i = 0;
        Node<T> temp = head;
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }
        return (temp != null) ? temp.data : null;
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void sort() {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node<T> curr = head;
            while (curr.next != null) {
                if (curr.data.compareTo(curr.next.data) > 0) {
                    T tempData = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = tempData;
                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        Q17<Integer> list = new Q17<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.print();
        list.sort();
        list.print();
        list.remove(1);
        list.print();
        System.out.println("Get index 1: " + list.get(1));
    }
}
