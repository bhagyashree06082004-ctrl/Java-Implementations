class myNewException extends Exception
{
    public String toString()
    {
        return "My Exception Occurred";
    }
}

public class myException {
    public static void main(String[] args) {
        try {
            throw new myNewException();
        } catch (myNewException e) {
            System.out.println(e);
        }
    }
}
