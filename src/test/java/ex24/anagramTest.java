/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */
package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class anagramTest {
    public anagram obj;

    public void setup()
    {

        obj = new anagram();
    }

    @Test
    public void isAnagramTestTwoSameLengthSameLetterString()
    {
        setup();
        String str1 = "note";
        String str2 = "tone";
        boolean ret = obj.isAnagram(str1, str2);
        assertTrue(ret);
    }
    @Test
    public void isAnagramTestTwoSameLengthDifferentLettersString()
    {
        setup();
        String str1 = "night";
        String str2 = "right";
        boolean ret = obj.isAnagram(str1, str2);
        assertTrue(ret);
    }
    @Test
    public void isAnagramTestTwoDifferentLengthString()
    {
        setup();
        String str1 = "Knight";
        String str2 = "nite";
        boolean ret = obj.isAnagram(str1, str2);
        assertFalse(ret);
    }

}