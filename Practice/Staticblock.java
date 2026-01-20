class Test{
   static {
        System.out.println("block 1 test ");
    } 
}

public class Staticblock {
    static {
        System.out.println("block 1 ");
    }
    public static void main(String[] args) {
        Test t = new Test();

        System.out.println("main");
    }
    static {
        System.out.println("block 2 ");
    }

}
