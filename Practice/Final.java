class Final_test {
    //final vars are written in CAPITAL letters
    final int ONE = 1;
    final static int TWO;
    final int THREE;

    static{
        TWO =2;
    }

    public Final_test() {
        this.THREE = 3;
    }

    //final methods can nt be overridden
    //we can't inerit final classes 

    final int finalmethod(){
        return 0;
    }

    
    
}

public class Final extends Final_test{
    public static void main(String[] args) {
        Final_test fn = new Final_test();
        //fn.ONE = 10; final cant be changed


    }

    //public float finalmethod(){
      //  reutrn 0.0;
    //}

}

