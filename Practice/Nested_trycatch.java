public class Nested_trycatch {
    public static void main(String[] args) {
        int a,b;
        try {
            a = 1/0;
        } catch (ArithmeticException e) {
            a = 0;
            try{
                b = 10/a;
            } catch (ArithmeticException ex){
                b=0;
            }
        }
        
    }
}
