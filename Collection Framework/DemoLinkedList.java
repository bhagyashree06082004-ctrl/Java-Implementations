import java.util.LinkedList;

public class DemoLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        LinkedList<Integer> m = new LinkedList<>();
        m.add(34);
        l.add(23);
        l.addFirst(43);
        l.addLast(90);
        l.add(3, 34);

        System.out.println(l.get(3));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());






    }

}
