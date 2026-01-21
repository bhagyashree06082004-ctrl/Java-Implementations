package Prasad.jan22;
public class findele {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50, 60, 75, 90};
        int searchElement = 45;
        
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array");
        }
    }
}
//to run the program solely , just remove the package name in the first line
//command to run this program on terminal
//cd /Users/prasadchede/Desktop/Java-Implementations/Prasad/jan22/ && javac findele.java && java findele