class StaticTest {

    static int num = 10;
    int a, b; // static variable belongs to class, non-static belongs to object
    // static method can access only static members directly

    static{
        System.out.println("Inside Static Block");
    }

    static void OnRoadPrice(String city){
        switch(city){
            case "Delhi":
                System.out.println("On Road Price in Delhi: " + (num + 2000));
                break;
            case "Mumbai":
                System.out.println("On Road Price in Mumbai: " + (num + 3000));
                break;
            default:
                System.out.println("On Road Price in Other Cities: " + (num + 4000));
        }
    }
}

public class Static {

    static{
        System.out.println("Static Block 1");
    }
    public static void main(String[] args) {
        // StaticTest st1 = new StaticTest();
        // StaticTest st2 = new StaticTest();
        // System.out.println("Static Variable: " + st1.num);
        // st1.num = 20;
        // System.out.println("Static Variable: " + st2.num);
        // System.out.println(StaticTest.num);
        // StaticTest.OnRoadPrice("Delhi");
        // StaticTest.OnRoadPrice("Mumbai");
        // StaticTest.OnRoadPrice("Chennai");

        // StaticTest.OnRoadPrice("Bangalore");

        StaticTest st = new StaticTest();
    }

    static{
        System.out.println("Static Block 2");
    }
}
