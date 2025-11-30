class Student{
    private String name;
    private int age;
    private String grade;

    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }

    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age=age;
    }

    String getGrade(){
        return grade;
    }
    void setGrade(String grade){
        this.grade=grade;
    }
}

public class Ex1{
    public static void main(String[] args){
        Student abc=new Student();

        abc.setName("abc");
        abc.setAge(19);
        abc.setGrade("A+");

        String name=abc.getName();
        int age=abc.getAge();
        String grade=abc.getGrade();

        System.out.println("Name : "+name+"\nAge : "+age+"\nGrade : "+grade);
    }
}