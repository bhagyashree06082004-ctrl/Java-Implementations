public class trycatch {
    public static void main(String[] args) {
        int a=10;
        int b =0;

        try{
            int c = a/b;
            System.out.println("The result is: " + c);
        } catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        } finally{
            System.out.println("Execution completed.");
        }
    }
}
