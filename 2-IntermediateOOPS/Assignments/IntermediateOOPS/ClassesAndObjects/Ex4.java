class Employee{
    private String name;
    private double salary;
    private String hireDate;

    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }

    double getSalary(){
        return salary;
    }
    void setSalary(double salary){
        this.salary=salary;
    }

    String getHireDate(){
        return hireDate;
    }
    void setHireDate(String hireDate){
        this.hireDate=hireDate;
    }
}

public class Ex4{
    public static void main(String[] args){
        Employee john=new Employee();

        john.setName("John");
        john.setSalary(40000.00);
        john.setHireDate("08-09-2024");

        String name=john.getName();
        double salary=john.getSalary();
        String hireDate=john.getHireDate();
        
        System.out.println("Name : "+name+"\nSalary : "+salary+"\nHire Date : "+hireDate);
    }
}