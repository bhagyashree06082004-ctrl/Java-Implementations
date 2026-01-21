public class IsPrime 
{
    int gcd(int m, int n)
    {
        while (m != n)
        {
            if (m > n)
                m = m - n;
            else
                n = n - m;
        }
        return m;
    }

    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) 
    {
        IsPrime x = new IsPrime();

        System.out.println("GCD of 35 and 56: " + x.gcd(35, 56));

        int num = 29;
        System.out.println("Is " + num + " prime? " + IsPrime.isPrime(num));
    }
}
