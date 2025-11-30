// Create a class called "Employee" with properties such as "name", "salary", and "hireDate". Implement the necessary getter and setter methods for each property.

import java.time.LocalDate;

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public LocalDate getHireDate() { return hireDate; }
    public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }
}

public class Q4 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("John");
        e.setSalary(50000);
        e.setHireDate(LocalDate.of(2025, 1, 1));

        System.out.println(e.getName() + " " + e.getSalary() + " " + e.getHireDate());
    }
}