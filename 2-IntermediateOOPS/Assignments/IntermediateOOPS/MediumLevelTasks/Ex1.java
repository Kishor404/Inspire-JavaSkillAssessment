class Parent {
    void showParentMessage() {
        System.out.println("This is a method from the Parent class.");
    }
}

class Child extends Parent {
    void showChildMessage() {
        System.out.println("This is a method from the Child class.");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.showParentMessage();

        Child c = new Child();
        c.showParentMessage();
        c.showChildMessage();
    }
}
