public class Fish extends Animal{


    public Fish(String name, int age) {
        super(name, age);
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }

    public void makeBubbles() {
        System.out.println(name + " is making bubbles.");
    }
    
    public void move() {
        System.out.println(name + " is swimming.");
    }
}
