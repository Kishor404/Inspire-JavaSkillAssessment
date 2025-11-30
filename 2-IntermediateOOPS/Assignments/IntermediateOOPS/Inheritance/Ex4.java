class Person {
    String name;
    String age;
    String address;

    Person(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

class Student extends Person {
    String grade;
    String school;

    Student(String name, String age, String address, String grade, String school) {
        super(name, age, address);
        this.grade = grade;
        this.school = school;
    }

    void printStudentInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
        System.out.println("Grade : " + grade);
        System.out.println("School : " + school);
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Student s1 = new Student("John", "21", "Tamilnadu", "A", "TN School");
        s1.printStudentInfo();
    }
}