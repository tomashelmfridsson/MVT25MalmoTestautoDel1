package alfabetet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AlfabetetTest {
    @Test
    public void convert_1_Test(){
        assertEquals ('A',Converter.convertNumberToChar(1));
    }

    @Test
    public void convert_2_Test(){
        assertEquals ('B',Converter.convertNumberToChar(2));
    }

    @Test
    public void convert_A_Test(){
        assertEquals (1,Converter.convertCharToNumber('A'));
    }

    @Test
    public void convert_B_Test(){
        assertEquals (2,Converter.convertCharToNumber('B'));
    }

    @Test
    public void convert_a_Test(){
        assertEquals (1,Converter.convertCharToNumber('a'));
    }

    @Test
    public void convert_ABC_Test(){
        assertEquals (123,Converter.convertStringToNumber("ABC"));
    }

    @Test
    public void convert_abc_Test(){
        assertEquals (123,Converter.convertStringToNumber("abc"));
    }

    @Test
    public void convert_123_Test(){
        assertEquals ("ABC",Converter.convertNumberToString(123));
    }

}
