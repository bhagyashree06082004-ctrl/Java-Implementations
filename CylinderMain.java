

import java.util.Scanner;

class Cylinder {
    private double radius;
    private double height;

   
    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    double getCSA() {
        return 2 * Math.PI * radius * height;
    }

    double getTSA() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

public class CylinderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Cylinder c = new Cylinder(r, h);

        System.out.println("Curved Surface Area: " + c.getCSA());
        System.out.println("Total Surface Area: " + c.getTSA());
        System.out.println("Volume: " + c.getVolume());

        sc.close();
    }
}

