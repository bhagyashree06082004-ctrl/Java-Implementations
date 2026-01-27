@FunctionalInterface
interface mylambda{
    public void display(int x);
}

@FunctionalInterface
interface mylam{
    int sum(int x, int y);
}

public class Lambdaexp{
    public static void main(String[] args) {
        mylambda m = (x)->{System.out.println(x);};
        m.display(10);

        mylam m2 = (a,b)-> a+b;
        System.out.println(m2.sum(10,20));
    }
}