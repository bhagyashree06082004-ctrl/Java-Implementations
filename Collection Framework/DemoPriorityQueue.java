// PriorityQueue use the heap data structure and help to delete the element according to the priority. The smaller number has the highest priority.

// Comparator can chage the priority of it.

// by default it is the Min Heap

// To make the heap Max Heap we declare the comparator:




import java.util.*;

class ImplementComparator implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        if(a<b) return 1;
        if(a>b) return -1;
        return 0;

    }
}



public class DemoPriorityQueue {
    
    public static void main(String[] args) {
         PriorityQueue<Integer> p = new PriorityQueue<>();
         p.add(34);
         p.add(7234);
         p.add(734);
         p.add(4734);
         p.add(347);
         p.add(344);
         p.add(342);
         p.add(345);

         p.offer(67);
         System.out.println(p.peek());
         p.forEach((x)->System.out.print(x+" "));



         PriorityQueue<Integer> q = new PriorityQueue<>(new ImplementComparator());
         q.add(34);
         q.add(7234);
         q.add(734);
         q.add(4734);
         q.add(347);
         q.add(344);
         q.add(342);
         q.add(345);

         p.offer(67);
         System.out.println(q.peek());
         p.forEach((x)->System.out.print(x+" "));

    }


}
