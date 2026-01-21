import java.util.TreeSet;

class Point implements Comparable{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x ;
        this.y = y;
        
    }

    public String toString(){
        return "x = "+x+" y="+y;
    }

    public int  compareTo(Object o){
        Point p=(Point)o;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;

        return 0;
    }

    


}

public class DemoComparableImplementation {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();

        ts.add(new Point(12,23));
        ts.add(new Point(13,23));
        ts.add(new Point(652,233));
        ts.add(new Point(122,823));

        System.out.println(ts);


    }
}
