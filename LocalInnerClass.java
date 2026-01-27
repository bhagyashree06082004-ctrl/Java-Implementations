class Outer{
    void method(){
        class Inner{
            void display(){
                System.out.println("Local Inner Class Method");
            }
        }

        Inner i = new Inner(); // class inside method can be instantiated only within the method
        i.display();
    }

    static class StaticInner{
        void show(){
            System.out.println("Static Inner Class Method");
        }
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();

        Outer.StaticInner si = new Outer.StaticInner();
        si.show();

       
    } 
}
