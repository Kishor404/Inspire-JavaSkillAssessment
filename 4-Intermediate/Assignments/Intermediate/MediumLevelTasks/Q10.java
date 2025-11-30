// Implement a hash table data structure in Java using either an array or a linked list. The hash table should have methods for inserting, deleting, and searching for keys.

class HashEntry {
    String key;
    int value;
    HashEntry next;

    HashEntry(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

class SimpleHashTable {
    private HashEntry[] table;
    private int size = 16;

    public SimpleHashTable() {
        table = new HashEntry[size];
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(String key, int value) {
        int index = hash(key);
        HashEntry head = table[index];
        HashEntry current = head;

        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        HashEntry newEntry = new HashEntry(key, value);
        newEntry.next = head;
        table[index] = newEntry;
    }

    public Integer get(String key) {
        int index = hash(key);
        HashEntry current = table[index];
        while (current != null) {
            if (current.key.equals(key)) return current.value;
            current = current.next;
        }
        return null;
    }

    public void remove(String key) {
        int index = hash(key);
        HashEntry current = table[index];
        HashEntry prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) table[index] = current.next;
                else prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        SimpleHashTable ht = new SimpleHashTable();
        ht.put("apple", 1);
        ht.put("banana", 2);
        System.out.println("apple -> " + ht.get("apple"));
        ht.remove("apple");
        System.out.println("apple -> " + ht.get("apple"));
    }
}