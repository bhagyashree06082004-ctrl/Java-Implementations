 // no duplicate is allowed plus it has the time complextiy is O(1).
 // it does not follow any order


 import java.lang.*;
import java.util.HashSet;
import java.util.Iterator;



public class DemoHashSet {
    
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("Pankaj");
        h.add("Mayur");
        h.add("Om");
        h.add("Vedant");

        Iterator<String> it = h.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }



}
