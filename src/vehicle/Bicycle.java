package vehicle;

public class Bicycle extends Vehicle {
    // Klass Attribut
    private Integer currentGear, maxGear, force;
            // Klassen Integer
            // prim var int
    public int currentGear() {
        return currentGear;
    }

    // Hur många växlar den har sätts i Konstruktorn
    // NbrOfGears
    public Bicycle(int nbr) {
        this.maxGear = nbr;
        this.currentGear = 1;
        this.force = 0;
    }

    public void changeGear(char operator) {
        if (operator == '+' && currentGear < maxGear) currentGear++;
        if (operator == '-' && currentGear > 1) currentGear--;
        setNewSpeed();
    }

    // Kraften i benen max 500N
    public void increaseSpeed(int force) {
        this.force = this.force + force;
        setNewSpeed();
    }

    // Egen metod för setSpeed
    public void setNewSpeed() {
        System.out.println("force "+force);
        setSpeed(this.force * currentGear / maxGear / 10);
    }

}
