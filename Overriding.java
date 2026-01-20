class Shape{
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Circle();
        s1.draw();
        s2.draw();
    }
}
