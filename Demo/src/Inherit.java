
class Parent
{

     Parent()
    {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
    }
}
class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("GrandChild Constructor");
    }
}
public class Inherit {


    public static void main(String[] args)
    {
      GrandChild c = new GrandChild();
    }
}