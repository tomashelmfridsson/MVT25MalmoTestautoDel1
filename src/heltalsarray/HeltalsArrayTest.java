package heltalsarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeltalsArrayTest {

    @Test
    public void add5IntegerTest() {
        HeltalsArray myArray = new HeltalsArray();
        myArray.add(4);
        myArray.add(2);
        myArray.add(10);
        myArray.add(20);
        myArray.add(12);
        assertEquals("HeltalsArray{arr=[4, 2, 10, 20, 12]}", myArray.toString());
    }

    @Test
    public void add6IntegerTest() {
        HeltalsArray myArray = new HeltalsArray();
        myArray.add(4);
        myArray.add(2);
        myArray.add(10);
        myArray.add(20);
        myArray.add(12);
        myArray.add(13);
        assertEquals("HeltalsArray{arr=[4, 2, 10, 20, 12]}", myArray.toString());
    }

    @Test
    public void getIndex3Test() {
        HeltalsArray myArray = new HeltalsArray();
        myArray.add(4);
        myArray.add(2);
        myArray.add(10);
        myArray.add(20);
        myArray.add(12);
        int actual = myArray.getValue(3);
        assertEquals(20, actual);
    }

    @Test
    public void getIndex7Test() {
        HeltalsArray myArray = new HeltalsArray();
        myArray.add(4);
        myArray.add(2);
        myArray.add(10);
        myArray.add(20);
        myArray.add(12);
        Integer actual = myArray.getValue(7);
        assertNull(actual);
    }

}
