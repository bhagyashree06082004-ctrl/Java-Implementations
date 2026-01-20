
class Circle{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle{
    private double height;

    Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double calculateVolume() {
        return calculateArea() * height;
    }
}



public class Inheritance1 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(5,6);
        System.out.println("Volume of Cylinder: " + c.calculateVolume());
        System.out.println("Area of Base Circle: " + c.calculateArea());
        System.out.println("Perimeter of Base Circle: " + c.calculatePerimeter());
    }
    
}
