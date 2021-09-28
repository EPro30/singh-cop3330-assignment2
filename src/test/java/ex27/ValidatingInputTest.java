package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatingInputTest {
    public ValidatingInput obj;

    public void setup()
    {
        obj = new ValidatingInput();
    }
    @Test
    public void validationCheckWrongInput1()
    {
        setup();
        String str1 = "J", str2 = "", str3 = "ABCDE", str4 = "A12-1234";
        int ret1 = obj.isValidFirstName(str1);
        int ret2 = obj.isValidLastName(str2);
        boolean ret3 = obj.isValidZip(str3);
        boolean ret4 = obj.isValidID(str4);
        assertEquals(2, ret1);
        assertEquals(1, ret2);
        assertFalse(ret3);
        assertFalse(ret4);
    }

    @Test
    public void validationCheckWrongInput2()
    {
        setup();
        String str1 = "", str2 = "J", str3 = "AB1DE", str4 = "AAAA-1234";
        int ret1 = obj.isValidFirstName(str1);
        int ret2 = obj.isValidLastName(str2);
        boolean ret3 = obj.isValidZip(str3);
        boolean ret4 = obj.isValidID(str4);
        assertEquals(1, ret1);
        assertEquals(2, ret2);
        assertFalse(ret3);
        assertFalse(ret4);
    }

    @Test
    public void validationCheckWrongInput3()
    {
        setup();
        String str1 = "", str2 = "", str3 = "dffddf", str4 = "GH-1234";
        int ret1 = obj.isValidFirstName(str1);
        int ret2 = obj.isValidLastName(str2);
        boolean ret3 = obj.isValidZip(str3);
        boolean ret4 = obj.isValidID(str4);
        assertEquals(1, ret1);
        assertEquals(1, ret2);
        assertFalse(ret3);
        assertTrue(ret4);
    }

    @Test
    public void validationCheckWrongInput4()
    {
        setup();
        String str1 = "J", str2 = "L", str3 = "ABCDE", str4 = "A12-1234";
        int ret1 = obj.isValidFirstName(str1);
        int ret2 = obj.isValidLastName(str2);
        boolean ret3 = obj.isValidZip(str3);
        boolean ret4 = obj.isValidID(str4);
        assertEquals(2, ret1);
        assertEquals(2, ret2);
        assertFalse(ret3);
        assertFalse(ret4);
    }

    @Test
    public void validationCheckRightInput()
    {
        setup();
        String str1 = "Jimmy", str2 = "James", str3 = "55555", str4 = "TK-421";
        int ret1 = obj.isValidFirstName(str1);
        int ret2 = obj.isValidLastName(str2);
        boolean ret3 = obj.isValidZip(str3);
        boolean ret4 = obj.isValidID(str4);
        assertEquals(0, ret1);
        assertEquals(0, ret2);
        assertTrue(ret3);
        assertTrue(ret4);
    }

}