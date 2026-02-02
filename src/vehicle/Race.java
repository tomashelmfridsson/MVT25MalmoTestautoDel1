package vehicle;

public class Race {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myCar2 = new Car();

        myCar.increaseSpeed(10);
        myCar.increaseSpeed(20);
        myCar2.setSpeed(50);

        System.out.println("Car1: " + myCar.getSpeed());
        System.out.println("Car2: " + myCar2.getSpeed());

        // ********* Bicycle

        Bicycle myBicycle = new Bicycle(7);
        myBicycle.increaseSpeed(200);
        System.out.println("Min cykelfart är: " + myBicycle.getSpeed());
        myBicycle.changeGear('+');
        System.out.println("Min växel är " + myBicycle.currentGear);
        myBicycle.changeGear('+');
        System.out.println("Min växel är " + myBicycle.currentGear);
        System.out.println("Min cykelfart är: " + myBicycle.getSpeed());
        myBicycle.increaseSpeed(300);
        myBicycle.changeGear('+');
        myBicycle.changeGear('+');
        myBicycle.changeGear('+');
        myBicycle.changeGear('+');
        System.out.println("Min cykelfart är: " + myBicycle.getSpeed());
        System.out.println("Min växel är " + myBicycle.currentGear);
        myBicycle.changeGear('-');
        System.out.println("Min cykelfart är: " + myBicycle.getSpeed());
        System.out.println("Min växel är " + myBicycle.currentGear);



    }

}
