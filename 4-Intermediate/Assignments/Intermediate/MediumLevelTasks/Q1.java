// Write a Java program that demonstrates the use of inheritance by creating a parent class and a child class that inherits from it. Instantiate objects of both classes and invoke their methods

class Parent {
    public void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("Child show()");
    }

    public void childOnly() {
        System.out.println("Child only method");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        p.show();
        c.show();
        c.childOnly();

        Parent poly = new Child();
        poly.show();
    }
}