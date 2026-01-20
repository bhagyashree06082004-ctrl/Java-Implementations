class StaticExample {
    static long price = 10000; //can be accessed by class or objects as well
    long nonstaticprice = 10000; //objects are needed to access them
//static mehtods are there and they can access only static vars and not non static members and these methods can be called using class or objects
//We can also create static classes as well

}

public class Static{
    public static void main(String[] args) {
        System.out.println(StaticExample.price);
        StaticExample.price = 20000;
        StaticExample se1 = new StaticExample();
        System.out.println(se1.price);
        System.out.println(se1.nonstaticprice);
        se1.price = 30000;
        StaticExample se2 = new StaticExample();
        System.out.println(se2.price);
        System.out.println(se2.nonstaticprice);
        
    }
}