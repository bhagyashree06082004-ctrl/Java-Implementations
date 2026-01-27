class CoffeeMachine{
    private float water;
    private float milk;
    private float coffeeBeans;
    private float sugar;

    static private CoffeeMachine instance = null;

    private CoffeeMachine(){
        this.water = 1000;
        this.milk = 500;
        this.coffeeBeans = 200;
        this.sugar = 100;
    }   
    
    public void fillWater(float water){
        this.water += water;
    }

    public void fillMilk(float milk){
        this.milk += milk;
    }

    public void fillCoffeeBeans(float coffeeBeans){
        this.coffeeBeans += coffeeBeans;
    }

    public void addSugar(float sugar){
        this.sugar += sugar;
    }

    static public CoffeeMachine getInstance(){
        if(instance == null){
            instance = new CoffeeMachine();
        }
        return instance;
    }
}




public class SingletonClass {
    public static void main(String[] args) {
        CoffeeMachine cm1 = CoffeeMachine.getInstance();
        CoffeeMachine cm2 = CoffeeMachine.getInstance();

        if(cm1 == cm2){
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}
