import java.util.*;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Sugar");
        arr.add("Milk");
        arr.add("Tea");

        System.out.println(arr.get(0));

        arr.set(0, "Coffee");
        arr.remove("Milk");

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        HashSet<Integer> set = new HashSet<>();

        set.add(7);
        set.add(8);
        set.add(9);

        if(set.contains(8)){
            System.out.println("Set contains 8");
        }

        set.remove(9);

        for(Integer num : set){
            System.out.println(num);
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Apple", 4);

        System.out.println("Apple key: " + map.get("Apple"));
        System.out.println("Contains Banana key: " + map.containsKey("Banana"));


    }
}
