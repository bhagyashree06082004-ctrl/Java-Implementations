public class Method2 
{
    boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }

    boolean validate(int age)
    {
        return age >= 3 && age <= 15;
    }

    int reverse(int n)
    {
        int rev = 0;

        while (n > 0)
        {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    int[] reverse(int A[])
    {
        int B[] = new int[A.length];

        for (int i = A.length - 1, j = 0; i >= 0; i--, j++)
            B[j] = A[i];

        return B;
    }

    static double area(double radius)
    {
        return Math.PI * radius * radius;
    }

    static double area(double length, double breadth)
    {
        return length * breadth;
    }

    public static void main(String[] args) 
    {
        Method2 obj = new Method2();

        String name = "Pratiksha Kulkarni";
        System.out.println("Is name valid? " + obj.validate(name));

        int age = 10;
        System.out.println("Is age valid? " + obj.validate(age));

        int number = 1234;
        System.out.println("Reversed number: " + obj.reverse(number));

        int arr[] = {1, 2, 3, 4, 5};
        int reversedArr[] = obj.reverse(arr);

        System.out.print("Reversed array: ");
        for (int x : reversedArr)
            System.out.print(x + " ");

        System.out.println();

        System.out.println("Area of circle: " + Method2.area(7));
        System.out.println("Area of rectangle: " + Method2.area(10, 5));
    }
}
