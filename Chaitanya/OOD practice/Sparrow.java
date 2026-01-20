public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name, int age) {
        super(name, age);
    }

    public void chirp() {
        System.out.println(name + " is chirping.");
    }
    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
    
}
