// Create a class called "Student" with properties such as "name", "age", and "grade". Implement the necessary getter and setter methods for each property.

class Student {
    private String name;
    private int age;
    private String grade;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}

public class Q1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Kishor");
        s.setAge(19);
        s.setGrade("A");
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getGrade());
    }
}