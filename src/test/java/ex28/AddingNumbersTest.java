package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingNumbersTest {
    public AddingNumbers obj;

    public void setup()
    {
        obj = new AddingNumbers();
    }

    @Test
    public void sumCheck()
    {
        setup();
        //Just for a specific case mentioned in the example output
        //Only tests consecutive numbers: 1, 2, 3, 4, 5
        //For user input please execute the AddingNumbers.java
        int tot = 0, n = 0;
        for(int i =0; i < 5; i++) {
            assertEquals(tot+n, obj.sum(tot, n));
            tot = tot+n;
            n++;
        }
    }

}