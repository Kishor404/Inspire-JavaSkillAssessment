// Create a class called "Animal" with properties such as "name", "age", and "species". Create a subclass called "Dog" that inherits from the Animal class and adds properties such as "breed" and "color".

class Animal {
    protected String name;
    protected int age;
    protected String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void info() {
        System.out.println(name + " is a " + age + "-year-old " + species);
    }
}

class Dog extends Animal {
    private String breed;
    private String color;

    public Dog(String name, int age, String species, String breed, String color) {
        super(name, age, species);
        this.breed = breed;
        this.color = color;
    }

    public void dogInfo() {
        info();
        System.out.println("Breed: " + breed + ", Color: " + color);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Dog d = new Dog("Max", 3, "Dog", "Labrador", "Brown");
        d.dogInfo();
    }
}