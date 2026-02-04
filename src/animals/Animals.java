package animals;

public class Animals {
    // Attribut för alla djur
    private String name;

    // Konstruktor för klassen Animal
    public Animals(String name){
        this.name = name;
    }

    // Metoder för alla djur
    public String getName() {
        return name;
    }

    public void behaivor(){
        System.out.println("Sleep");
    }
}
