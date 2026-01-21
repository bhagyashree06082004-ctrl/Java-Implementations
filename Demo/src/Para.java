 class Parents
 {

     Parents()
     {
         System.out.println("Non-Param of Parent");
     }
     Parents(int x)
     {
         System.out.println("Param of Parent" + x);
     }
 }
 class Childs extends Parents
     {
       Childs()
       {
         System.out.println("Non-Param of Child");
       }

     Childs(int y)
     {
         System.out.println("Param of Child");
     }
     Childs(int x, int y)
     {
         super(x);
         System.out.println("print" + y);
     }
 }

     public class Para
     {
         public static void main (String[] args)
         {
             Childs c= new Childs(20, 10);
         }
     }

