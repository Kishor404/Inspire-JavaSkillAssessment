// Create a class called "Person" with properties such as "name", "age", and "address". Create a subclass called "Student" that inherits from the Person class and adds properties such as "grade" and "school".

class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

class StudentPerson extends Person {
    private String grade;
    private String school;

    public StudentPerson(String name, int age, String address, String grade, String school) {
        super(name, age, address);
        this.grade = grade;
        this.school = school;
    }

    public void showStudent() {
        System.out.println(name + ", " + age + ", " + address);
        System.out.println("Grade: " + grade + ", School: " + school);
    }
}

public class Q4 {
    public static void main(String[] args) {
        StudentPerson s = new StudentPerson("Alice", 18, "City", "A", "ABC School");
        s.showStudent();
    }
}