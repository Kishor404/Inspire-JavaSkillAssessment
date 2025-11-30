class Animal{
    String name;
    int age;
    String species;

    Animal(String name, int age, String species){
        this.name=name;
        this.age=age;
        this.species=species;
    }
}

class Dog extends Animal{
    String breed;
    String color;
    Dog(String name, int age, String species, String breed, String color){
        super(name, age, species);
        this.breed=breed;
        this.color=color;
    }
    void printDogInfo(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nSpecies : "+species+"\nBreed : "+breed+"\nColor : "+color);
    }
}

public class Ex1{
    public static void main(String[] args) {
        Dog jimmy=new Dog("Jimmy", 11, "Dog", "Husky", "Grey And White");
        jimmy.printDogInfo();
    }
}