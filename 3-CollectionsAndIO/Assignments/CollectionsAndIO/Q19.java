// 19) Create a class that is serialisable and write a program to serialise and deserialise the object.

import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class Q19 {
    public static void main(String[] args) {
        Student s = new Student("Kishor", 20);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(s);
            System.out.println("Serialized: " + s);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s2 = (Student) ois.readObject();
            System.out.println("Deserialized: " + s2);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
