class Shape {
    String numSides;
    String area;

    Shape(String numSides, String area) {
        this.numSides = numSides;
        this.area = area;
    }
}

class Rectangle extends Shape {
    String length;
    String width;

    Rectangle(String numSides, String area, String length, String width) {
        super(numSides, area);
        this.length = length;
        this.width = width;
    }

    void printRectangleInfo() {
        System.out.println("Number of Sides : " + numSides);
        System.out.println("Area : " + area);
        System.out.println("Length : " + length);
        System.out.println("Width : " + width);
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle("4", "200 sq units", "20", "10");
        rect.printRectangleInfo();
    }
}