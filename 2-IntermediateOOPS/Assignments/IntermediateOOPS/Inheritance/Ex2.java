class Vehicle{
    String make;
    String model;
    String year;

    Vehicle(String make, String model, String year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
}

class Car extends Vehicle{
    String numDoors;
    String color;
    Car(String make, String model, String year, String numDoors, String color){
        super(make, model, year);
        this.numDoors=numDoors;
        this.color=color;
    }
    void printCarInfo(){
        System.out.println("Make : "+make+"\nModel : "+model+"\nYear : "+year+"\nNum Doors : "+numDoors+"\nColor : "+color);
    }
}

public class Ex2{
    public static void main(String[] args) {
        Car jimmy=new Car("Audi", "R6", "2024", "4", "Red");
        jimmy.printCarInfo();
    }
}