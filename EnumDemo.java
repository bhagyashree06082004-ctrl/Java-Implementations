enum Dept{
    CS,IT,EXTC
}

public class EnumDemo {
    public static void main(String[] args) {
        Dept d = Dept.IT;
        System.out.println(d.ordinal());
    }
}
