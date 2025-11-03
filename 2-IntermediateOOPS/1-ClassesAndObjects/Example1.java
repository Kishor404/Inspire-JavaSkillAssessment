class Car {
    // Properties
    String make;
    String model;
    String color;
    int year;

    // Constructor
    public Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Methods
    public void accelerate() {
        System.out.println(color+" color "+make+" "+model+" "+year+" Accelerate..!!!");
    }

    public void brake() {
        System.out.println(color+" color "+make+" "+model+" "+year+" Stops..!!!");
    }

    public void turn(String direction) {
        System.out.println(color+" color "+make+" "+model+" "+year+" Turn "+direction+"..!!!");
    }
}

public class Example1{
    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Civi", "Black", 2005);
        myCar.accelerate();
        myCar.turn("left");
        myCar.brake();
    }
}