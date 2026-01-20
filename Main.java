
class Rectangle
{
    private double length;
    private double breadth;

    public Rectangle()
    {
        length=1;
        breadth=1;
    }

    public Rectangle(double l, double b)
    {
        this.length=l;
        this.breadth=b;
    }
    public Rectangle(double s)
    {
        length=breadth=s;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        if(l>=0) length = l;
        else length = 0;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double b) {
        if(b>=0) breadth = b;
        else breadth = 0;
    }

    public double area()
    {
        return length*breadth;
    }

    public double perimeter()
    {
        return 2*(length+breadth);
    }


    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(10, 5);
        System.out.println(r.area());
    }
}

