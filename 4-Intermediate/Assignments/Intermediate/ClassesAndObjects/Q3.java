// Create a class called "Rectangle" with properties such as "length" and "width". Implement methods such as "getArea" and "getPerimeter" that calculate and return the area and perimeter of the rectangle.

class Rectangle {
    private double length;
    private double width;

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(5);
        r.setWidth(3);
        System.out.println("Area = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter());
    }
}