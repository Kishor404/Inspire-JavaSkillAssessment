// Implement an abstract class in Java with at least one abstract method. Create a concrete class that extends the abstract class and implement the abstract method. Instantiate the concrete class and invoke its method.
abstract class ShapeAbs {
    public abstract double area();
    public void printArea() {
        System.out.println("Area = " + area());
    }
}

class CircleAbs extends ShapeAbs {
    private double radius;

    public CircleAbs(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Q1 {
    public static void main(String[] args) {
        ShapeAbs s = new CircleAbs(5);
        s.printArea();
    }
}