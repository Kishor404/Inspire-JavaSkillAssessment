// Create a class called "Shape" with a method called "draw" that prints out "Drawing a shape". Create subclasses such as "Rectangle" and "Circle" that override the draw method to print out "Drawing a rectangle" and "Drawing a circle" respectively.

class ShapePoly {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class RectanglePoly extends ShapePoly {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class CirclePoly extends ShapePoly {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Q1 {
    public static void main(String[] args) {
        ShapePoly s1 = new ShapePoly();
        ShapePoly s2 = new RectanglePoly();
        ShapePoly s3 = new CirclePoly();

        s1.draw();
        s2.draw();
        s3.draw();
    }
}