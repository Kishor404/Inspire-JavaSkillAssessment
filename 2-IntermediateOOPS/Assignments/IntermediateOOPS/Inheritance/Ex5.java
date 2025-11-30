class Animal {
    String name;
    int age;
    String species;

    Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
}

class Cat extends Animal {
    String color;
    int numLives;

    Cat(String name, int age, String species, String color, int numLives) {
        super(name, age, species);
        this.color = color;
        this.numLives = numLives;
    }

    void printCatInfo() {
        System.out.println("Name : " + name +
                           "\nAge : " + age +
                           "\nSpecies : " + species +
                           "\nColor : " + color +
                           "\nNumber of Lives : " + numLives);
    }
}

public class Ex5 {
    public static void main(String[] args) {
        Cat kitty = new Cat("Whiskers", 3, "Cat", "White", 9);
        kitty.printCatInfo();
    }
}