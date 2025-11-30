class Rectangle{
    double width;
    double length;
    Rectangle(double w, double l){
        this.width=w;
        this.length=l;
    }
    double getArea(){
        return width*length;
    }
    double getPerimeter(){
        return 2*(width+length);
    }
}

public class Ex3{
    public static void main(String[] args){
        
        Rectangle bench=new Rectangle(10.0,20.0);
        System.out.println("Area Of Bench : "+bench.getArea());
        System.out.println("Perimeter Of Bench : "+bench.getPerimeter());
        
    }
}