import java.util.*;

public class ListDemo{

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(20);// passing value give the initial capacity and extend if we add more element.

        ArrayList<Integer> b = new ArrayList<>(List.of(23,34,43,56,67));
        a.add(10 ); //Can also add at the specific position.
        a.add(0, 85);

        a.addAll(b);

        System.out.println(a.contains(23));
        System.out.println(a.get(5));
        System.out.println(a.set(4, 20));// replace the value at that index with the given value.

        for(int i =0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }

        Iterator<Integer> it = a.iterator(); //Iterator object created.

        while(it.hasNext()){
            System.out.print(it.next());
        }



    }

}