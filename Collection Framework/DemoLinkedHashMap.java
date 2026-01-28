// in linked hash map their will be next and previous pointer that will be similar to the double linkedlist.
//Order of the key is maintained.

import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(Map.of(1,"W", 2,"R",4,"T"));

        System.out.println(lhm.get(4));
        System.out.println(lhm.putIfAbsent(90, "Pankaj"));
        System.out.println(lhm);
    }
}


class LinkedHashMapDemo{
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lm = new LinkedHashMap<>(5);// 5 is the inital size and size increase as per their requirement
        lm.put(1,"Pankaj"); 
        lm.put(2,"Mayur"); 
        lm.put(3,"Vedant"); 
    }
}