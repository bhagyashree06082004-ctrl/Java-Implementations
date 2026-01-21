
// it performs the basic operation in log(n) time.
// it gives the array as an result

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;



public class DemoTreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(24,6,67,22,756,8,7,314,65,876,341));
        System.out.println(ts);
        System.out.println(ts.ceiling(64));
        System.out.println();


        

        SortedSet<Integer> ss = new TreeSet<>(List.of(24,6,67,22,756,8,7,314,65,876,341));

        
        System.out.println(ss);



    }
    
}
