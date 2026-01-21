@interface myanno{//user defined annotation used for maintaingn metadata suppose in this case the author name for class or method and all
    String name();
}

@myanno(name="Amey")
public class UserAnnotation {
    public static void main(String[] args) {
        int x;

    }

    @myanno(name="Amey")
    public void name(){}
}
