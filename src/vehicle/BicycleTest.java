package vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void changeGearTest(){
        Bicycle myTestBicycle = new Bicycle(3);
        myTestBicycle.changeGear('+');
        assertEquals(0,myTestBicycle.getSpeed());
    }
}
