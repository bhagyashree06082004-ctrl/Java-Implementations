class Outer{
    public static int x=15;

    class Inner{
        int y=20;
         public  void innerPrint(){
            System.out.println(x + " " + y);
         }
    }

    static class staticClass{
        int var = 100;
        void staticMethod(){
            System.out.println("This is Static Inner class : " + var);
        }
    }
    public  void print(){
        System.out.println("Outer");
        Inner in = new Inner();
        in.innerPrint();
        System.out.println(in.y);
    }
    public void method(){
        class Local{
            String getName(){
                return "This is Local class";
            }
        }
        String str = new Local().getName();
        System.out.println(str);
    }

}
class  InnerClass{
    public static void main(String[] args) {
        Outer out = new Outer();
        out.print();
        Outer.Inner in = new Outer().new Inner();
        in.innerPrint();
        out.method();
        Outer.staticClass sc = new Outer.staticClass();
        sc.staticMethod();
    }
}