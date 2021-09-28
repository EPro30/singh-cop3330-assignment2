/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */
package ex25;

import java.util.Scanner;

public class PasswordStrengthIndicator {
    public static boolean case1(int len, String str)
    {
        for(int i = 0; i < len; i++)
        {
            int ascii =str.charAt(i);
            if((ascii >= 48) && (ascii <= 57))
                return true;
        }
        return false;
    }

    public static boolean case2(int len, String str)
    {
        for(int i = 0; i < len; i++)
        {
            int ascii =str.charAt(i);
            if(((ascii >= 65) && (ascii <= 90)) || ((ascii >= 97) && (ascii <= 122)))
                return true;
        }
        return false;
    }

    public static boolean case3(int len, String str)
    {
        //Special characters ! @ # $
            for (int i = 0; i < len; i++) {
                int ascii = str.charAt(i);
                if ((ascii == 33) || (ascii == 35) || (ascii == 36) || (ascii == 38))
                    return true;
            }
        return false;
    }

    public static int passwordValidator(String str)
    {
        int len = str.length();
        if(case1(len, str) && (len < 8)){
            return 1;}
        else if(case2(len, str) && (len < 8)){
            return 2;}
        else if(case1(len, str) && (len > 7) && case2(len, str) && !(case3(len, str))){
            return 3;}
        else if(case1(len, str) && case2(len, str) && (case3(len, str)) && (len > 7)){
            return 4;}
        else
            return 5;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(); //Password input
        String msg;
        int retNum = passwordValidator(str1);
        switch(retNum)
        {
            case 1:
                msg = "very weak password.";
                break;
            case 2:
                msg = "weak password.";
                break;
            case 3:
                msg = "strong password.";
                break;
            case 4:
                msg = "very strong password.";
                break;
            default:
                msg = "an Invalid Input.";
        }
        System.out.println("The password '" + str1 + "' is a "+ msg);
    }
}
