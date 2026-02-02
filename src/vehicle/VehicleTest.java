package vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    @Test
    public void createObjectTest(){
        Vehicle myTestVehicle = new Vehicle();
        assertEquals(0,myTestVehicle.getSpeed());
    }

    @Test
    public void setSpeedTest(){
        Vehicle myTestVehicle = new Vehicle();
        myTestVehicle.setSpeed(100);
        assertEquals(100,myTestVehicle.getSpeed());
    }
}
