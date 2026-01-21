public class Bird extends Animal {
    // private String species;
    // private int wingSpan;

    public Bird(String name, int age) {
        // this.species = species;
        // this.wingSpan = wingSpan;
        super(name, age);
    }

    // public void fly() {
    //     System.out.println(name + " is flying.");
    // }

    public void sing() {
        System.out.println(name + " is singing.");
    }
    public void move() {
        System.out.println(name + " is flying.");
    }
}
