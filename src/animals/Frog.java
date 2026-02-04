package animals;

public class Frog extends Animals{
    // attribut för endast Frogs
    private int age;


    public Frog(String name, int age) {
        super(name);
        this.age = age;
    }

    public void behaivor(int nbrOfJumps, double length) {
        System.out.println("Jump " + nbrOfJumps * length);
    }

}
