package vehicle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void createObjectTest(){
        Car myTestCar = new Car();
        assertEquals(0,myTestCar.getSpeed());
    }

    @Test
    public void setSpeedTest(){
        Car myTestCar = new Car();
        myTestCar.setSpeed(100);
        assertEquals(100,myTestCar.getSpeed());
    }

    @Test
    public void increaseSpeedTest(){
        Car myTestCar = new Car();
        myTestCar.increaseSpeed(100);
        assertEquals(100,myTestCar.getSpeed());
    }
}
