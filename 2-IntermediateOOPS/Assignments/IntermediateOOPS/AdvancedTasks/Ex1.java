abstract class Vehicle {
    abstract void startEngine();
    void stopEngine() {
        System.out.println("The engine is stopped.");
    }
}
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("The car engine starts with a key.");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.startEngine();
        myCar.stopEngine();
    }
}
