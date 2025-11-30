class Animal {
    void speak() {
        System.out.println("The animal says roar");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog says woof");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("The cat says meow");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        a1.speak();
        a2.speak();
        a3.speak();
    }
}