package division;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    public void simpleTest(){
        Calculator calc = new Calculator();
        assertEquals(2, calc.division(10,5));
    }

    @Test
    public void denominator0Test(){
        Calculator calc = new Calculator();
        Double res;
        try {
            res = calc.division(10,0);
        } catch (ArithmeticException e){
            res = null;
        }
        assertNull(res);
    }
}
