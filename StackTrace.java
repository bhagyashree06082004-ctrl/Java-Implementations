public class StackTrace {
    public static void main(String[] args) {
        try {
           meth1(); 
        } catch (ArithmeticException e) {
            System.out.print(e.toString());
            e.printStackTrace();
            
        }
    }
    public static void meth1() throws ArithmeticException {
        meth2();
    }
    public static void meth2() throws ArithmeticException{
        meth3();
    }
    public static void meth3() throws ArithmeticException{
        int a = 10/0;
    }
}
