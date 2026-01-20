public class Exception {
    public static void main(String[] args) {
        int a ,b,c;
        a=5;
        b=0;
        // c = 5/0; divide by zero error
        try {
            c = 5/0;
        } catch (ArithmeticException e) {
            c = 0;
        }//there can be more than one catch block for a try block

        try {
            c = 5/0;            
        } catch (ArithmeticException e) {
            c=0;
        } catch(ArrayIndexOutOfBoundsException e){
            c=100;
        } finally{
            System.out.println(a+b+c);
        }

    }
}
