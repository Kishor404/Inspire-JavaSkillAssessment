class Person {
    String name;
    int age;
   
    // Default Constructor
    public Person() {
        name = "John Doe";
        age = 30;
    }
}

class Car {
    String make;
    String model;
    int year;
   
    // Non-parameterized Constructor
    public Car() {
        make = "Toyota";
        model = "Camry";
        year = 2022;
    }
}

class Employee {
    String name;
    int id;
    double salary;
   
    // Parameterized Constructor
    public Employee(String empName, int empId, double empSalary) {
        name = empName;
        id = empId;
        salary = empSalary;
    }
}

public class ConstructorTypes{
    public static void main(String[] args){
        Person a=new Person();
        System.out.println(a.name+" "+a.age);
        Car b=new Car();
        System.out.println(b.make+" "+b.model+" "+b.year);
        Employee c=new Employee("MyName", 890, 2000000.0);
        System.out.println(c.name+" "+c.id+" "+c.salary);
    }
}