class Shape{
    void draw(){
        System.out.println("Drawing A Shape");
    }
}
class Rectangle extends Shape{

    @Override
    void draw(){
        System.out.println("Drawing A Rectangle");
    }
}
class Circle extends Shape{
    
    @Override
    void draw(){
        System.out.println("Drawing A Circle");
    }
}

public class Ex1{
    public static void main(String[] args){
        
        Shape s=new Shape();
        Shape r=new Rectangle();
        Shape c=new Circle();

        r.draw();
        s.draw();
        c.draw();
    }
}