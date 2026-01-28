
import java.util.HashMap;
import java.util.Map;
//Red Black tree implementation and log(n) complexity by TreeMap
// HashMap use the complexity of O(1).
import java.util.TreeMap;

import java.util.Map.*;

public class DemoTreeMap {

    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(1, "A", 2, "B", 3, "C", 4, "D"));

        tm.put(5, "E");
        tm.put(6, "G");
        tm.put(7, "h");
        tm.put(8, "I");

        System.out.println(tm.get(8));

        Entry<Integer, String> e = tm.firstEntry();

        System.out.println(e.getKey()+" "+e.getValue());
        System.out.println();
        System.out.println(tm);


        HashMap<Integer, String> hm = new HashMap<>(Map.of(1, "A", 2, "B", 3, "C", 4, "D"));

    }

}
