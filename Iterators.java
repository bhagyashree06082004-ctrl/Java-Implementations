import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        // for (String lang : list) {
        //     if(lang.equals("C++")){
        //         list.remove(lang);
        //     }
        // }

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String la = it.next(); 

            if (la.equals("C++")) {
                it.remove(); 
            }
        }

        for (String lang : list) {
            System.out.println(lang);
        }
     
    }
}
