

//deque : it means deletion and insertion from both the side.

import java.util.ArrayDeque;

public class DemoArrayDeque {
    
    public static void main(String[] args) {

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.add(23);
        ad.offerLast(34);
        ad.offerLast(67);
        ad.offerLast(610);
        ad.offerFirst(86);
        ad.offerFirst(72);

        ad.forEach((x)->System.out.println(x));

        
    }

}
