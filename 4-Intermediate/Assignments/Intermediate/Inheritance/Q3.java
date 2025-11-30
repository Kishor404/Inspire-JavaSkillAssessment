// Create a class called "Shape" with properties such as "numSides" and "area". Create a subclass called "Rectangle" that inherits from the Shape class and adds properties such as "length" and "width".

class Shape {
    protected int numSides;
    protected double area;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public double getArea() {
        return area;
    }
}

class RectangleShape extends Shape {
    private double length;
    private double width;

    public RectangleShape(double length, double width) {
        super(4);
        this.length = length;
        this.width = width;
        this.area = length * width;
    }

    public void printInfo() {
        System.out.println("Rectangle with " + numSides + " sides, area = " + area);
    }
}

public class Q3 {
    public static void main(String[] args) {
        RectangleShape r = new RectangleShape(5, 3);
        r.printInfo();
    }
}