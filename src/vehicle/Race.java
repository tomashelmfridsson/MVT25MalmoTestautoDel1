package vehicle;

public class Race {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myCar2 = new Car();

        myCar.increaseSpeed(10);
        myCar.increaseSpeed(20);
        myCar2.setSpeed(50);

        System.out.println("Car1: "+myCar.getSpeed());
        System.out.println("Car2: "+myCar2.getSpeed());
    }

}
