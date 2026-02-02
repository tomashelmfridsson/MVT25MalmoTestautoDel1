package vehicle;

public class Bicycle extends Vehicle {
    // Klass Attribut
    private int currentGear, maxGear, force;

    public int currentGear(){
        return currentGear;
    }

    // Hur många växlar den har
    public Bicycle(int nbr) {
        this.maxGear = nbr;
        this.currentGear = 1;
    }

    public void changeGear(char operator) {
        if (operator == '+' && currentGear < maxGear) currentGear++;
        if (operator == '-' && currentGear > 1) currentGear--;
        setSpeed( this.force * currentGear / maxGear / 10);
    }

    // Kraften i benen max 500N
    public void increaseSpeed(int force) {
        this.force = this.force + force;
        setSpeed( this.force * currentGear / maxGear / 10);
    }


}
