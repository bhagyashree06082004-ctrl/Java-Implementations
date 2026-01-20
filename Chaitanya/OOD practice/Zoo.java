
public class Zoo{
    public static void main(String[] args) {
        Animal chicken = new Chicken("Clucky", 2);
        Animal sparrow = new Sparrow("Jack", 1);
        sparrow.eat();
        sparrow.chirp();
        ((Flyable)sparrow).fly();
        makeAnimalMove(chicken);
       // makeAnimalMove(sparrow);
    }
    public static void makeAnimalMove(Animal animal) {
        animal.move();
    }
}