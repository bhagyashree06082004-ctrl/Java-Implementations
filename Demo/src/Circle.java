public class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

 class Cylinders extends Circle
{
    public double height;
    public double volume()
    {
        return area()*height;
    }
}

 class Circles {
    public static void main(String[] args) {
        Cylinders c = new Cylinders();
        c.radius = 7;
        c.height = 10;

        System.out.println(c.area());
    }
}
