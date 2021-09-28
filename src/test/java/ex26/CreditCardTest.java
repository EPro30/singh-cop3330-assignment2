package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {
    public CreditCard obj;

    public void setup()
    {
        obj = new CreditCard();
    }
    @Test
    public void ExampleOutputCheck()
    {
        setup();
        String str1 = "5000", str2 = "12", str3 = "100";
        int ret = (int)(obj.calculateMonthsUntilPaidOff(str1, str2, str3));
        assertEquals(70, ret);
    }

}