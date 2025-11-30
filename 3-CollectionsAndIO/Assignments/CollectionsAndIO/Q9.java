// 9) Implement a hash table data structure in Java using either an array or a linked list. The hash table should have methods for inserting, deleting, and searching for keys.

public class Q9 {
    static class HashTable {
        static class Entry {
            String key;
            int value;
            Entry next;

            Entry(String key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private Entry[] table;
        private int size;

        public HashTable(int size) {
            this.size = size;
            table = new Entry[size];
        }

        private int hash(String key) {
            return Math.abs(key.hashCode()) % size;
        }

        public void put(String key, int value) {
            int index = hash(key);
            Entry head = table[index];

            Entry current = head;
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }

            Entry newEntry = new Entry(key, value);
            newEntry.next = head;
            table[index] = newEntry;
        }

        public Integer get(String key) {
            int index = hash(key);
            Entry current = table[index];
            while (current != null) {
                if (current.key.equals(key)) return current.value;
                current = current.next;
            }
            return null;
        }

        public void remove(String key) {
            int index = hash(key);
            Entry current = table[index];
            Entry prev = null;

            while (current != null) {
                if (current.key.equals(key)) {
                    if (prev == null) {
                        table[index] = current.next;
                    } else {
                        prev.next = current.next;
                    }
                    return;
                }
                prev = current;
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.put("one", 1);
        ht.put("two", 2);

        System.out.println(ht.get("one"));
        ht.remove("one");
        System.out.println(ht.get("one"));
    }
}
