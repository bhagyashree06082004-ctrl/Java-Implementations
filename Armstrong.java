public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int m = n;
        int sum = 0;
        int r;

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }

        if (sum == m)
            System.out.println("Its a Armstrong Number");
        else
            System.out.println("Its not an Armstrong Number");
    }
}
