class Outer{
    String name = "Outer Class";
    Inner i = new Inner();

    class Inner{
        String name = "Inner Class";
        void display(){
            System.out.println("Inner class method");
        }
    }

    void show(){
        i.display();
        System.out.println(this.name);
        System.out.println(i.name);
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();

        Outer.Inner oi = outer.new Inner(); //inner class object
        oi.display(); 
    }
}
