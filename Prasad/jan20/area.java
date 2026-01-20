package Prasad.jan20;

public class area {
        
        static double circleArea(double radius) {
            return Math.PI * radius * radius;
        }
        
        static double rectangleArea(double length, double width) {
            return length * width;
        }
        
        static int hcf(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        
        public static void main(String[] args) {
            double circleA = circleArea(5);
            double rectA = rectangleArea(4, 6);
            int hcfValue = hcf((int)circleA, (int)rectA);
            
            System.out.println("Circle Area: " + circleA);
            System.out.println("Rectangle Area: " + rectA);
            System.out.println("HCF: " + hcfValue);
        }
    }
    

