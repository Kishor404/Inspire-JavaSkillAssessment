// Create a class called "Animal" with properties such as "name", "age", and "species". Create a subclass called "Cat" that inherits from the Animal class and adds properties such as "color" and "numLives".

class AnimalBase {
    protected String name;
    protected int age;
    protected String species;

    public AnimalBase(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
}

class Cat extends AnimalBase {
    private String color;
    private int numLives;

    public Cat(String name, int age, String species, String color, int numLives) {
        super(name, age, species);
        this.color = color;
        this.numLives = numLives;
    }

    public void showCat() {
        System.out.println(name + " (" + species + "), age " + age);
        System.out.println("Color: " + color + ", Lives: " + numLives);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Cat c = new Cat("Kitty", 2, "Cat", "Black", 9);
        c.showCat();
    }
}