public class Cylinder {
    private double radius;
    private double height;


    //CONSTRUCTOR
    public Cylinder(double r, double h)
    {
        this.radius = r;
        this.height = h;
    }

    //GETTER & SETTER METHODS
    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        if(radius>=0) radius=r;
        else radius=0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        if(height>=0) height=h;
        else height=0;
    }

    public double area()
    {
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }

    public static void main(String[] args)
    {
        Cylinder cyl = new Cylinder(10, 20);
        System.out.println(cyl.area());
    }
}
