/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */

package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthIndicatorTest {
    public PasswordStrengthIndicator obj;

    public void setup()
    {
        obj = new PasswordStrengthIndicator();
    }

    @Test
    public void VeryWeakPassword()
    {
        setup();
        String str = "12345";
        int ret = obj.passwordValidator(str);
        assertEquals(1, ret);
    }

    @Test
    public void WeakPassword()
    {
        setup();
        String str = "abcdef";
        int ret = obj.passwordValidator(str);
        assertEquals(2, ret);
    }

    @Test
    public void StrongPassword()
    {
        setup();
        String str = "abc123xyz";
        int ret = obj.passwordValidator(str);
        assertEquals(3, ret);
    }

    @Test
    public void VeryStrongPassword()
    {
        setup();
        String str = "1337h@xor!";
        int ret = obj.passwordValidator(str);
        assertEquals(4, ret);
    }

}