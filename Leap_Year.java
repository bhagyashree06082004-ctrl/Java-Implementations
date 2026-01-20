public class Leap_Year {
    public static void main(String[] args) {

        int year = 2024; 
        
        System.out.println("Year: " + year);

        
        if (year % 4 == 0) {                
            if (year % 100 == 0) {         
                if (year % 400 == 0) {      
                    System.out.println("Its a Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Its a Leap Year");
            }
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
