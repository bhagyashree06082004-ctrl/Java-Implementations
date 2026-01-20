package OOPs;

class Rectangle {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    
    public double calculateArea() {
        return length * breadth;
    }

    
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(12,17);

        System.out.println("\n--- Rectangle Details ---");
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());

    }
}
