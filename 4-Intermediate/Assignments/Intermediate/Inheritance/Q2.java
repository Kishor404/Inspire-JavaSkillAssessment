// Create a class called "Vehicle" with properties such as "make", "model", and "year". Create a subclass called "Car" that inherits from the Vehicle class and adds properties such as "color" and "numDoors".

class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void showInfo() {
        System.out.println(year + " " + make + " " + model);
    }
}

class Car extends Vehicle {
    private String color;
    private int numDoors;

    public Car(String make, String model, int year, String color, int numDoors) {
        super(make, model, year);
        this.color = color;
        this.numDoors = numDoors;
    }

    public void showCar() {
        showInfo();
        System.out.println("Color: " + color + ", Doors: " + numDoors);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Corolla", 2022, "White", 4);
        c.showCar();
    }
}