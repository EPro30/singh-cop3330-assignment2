package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandleBadInputTest {
    public HandleBadInput obj;

    public void setup()
    {
        obj = new HandleBadInput();
    }

    //Function check
    //For user inputs please execute HandleBadInput.java
    @Test
    public void badInputCheck()
    {
        setup();
        String str = "0";
        assertTrue(obj.numCheck(str.charAt(0)));
        str = "ABC";
        assertTrue(obj.numCheck(str.charAt(0)));
        str = "4";
        assertFalse(obj.numCheck(str.charAt(0)));
        assertEquals((72/(Integer.parseInt(str))), obj.calcYears(Integer.parseInt(str)));
    }

}