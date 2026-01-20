
class my{
    private int a =10;
    public int b =10;
    int c =10;
    protected int d =10;

    public my(){}
    public my(my m){}

    public static void display(){}
    public void show(){}

}
public class ReflectorDemo {
    public static void main(String[] args) {
        my c = new my();
        my d = new my(c);
        System.out.print(c.equals(d));
    }
}
