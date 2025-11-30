// Create a class called "Animal" with a method called "speak" that prints out a message such as "The animal says roar". Create subclasses such as "Dog" and "Cat" that override the speak method to print out "The dog says woof" and "The cat says meow" respectively.

class AnimalPoly {
    public void speak() {
        System.out.println("The animal says roar");
    }
}

class DogPoly extends AnimalPoly {
    @Override
    public void speak() {
        System.out.println("The dog says woof");
    }
}

class CatPoly extends AnimalPoly {
    @Override
    public void speak() {
        System.out.println("The cat says meow");
    }
}

public class Q2 {
    public static void main(String[] args) {
        AnimalPoly a1 = new AnimalPoly();
        AnimalPoly a2 = new DogPoly();
        AnimalPoly a3 = new CatPoly();

        a1.speak();
        a2.speak();
        a3.speak();
    }
}