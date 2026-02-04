package animals;

public class Dog extends Animals{

    // Konstruktor
    public Dog(String name){
        super(name);
    }

    // methods
    @Override
    public void behaivor(){
        System.out.println("Bark");
    }

}
