/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */

package ex27;

import java.util.Scanner;

public class ValidatingInput {

    public static int isValidFirstName(String str) {
        if(str.isEmpty())
            return 1;
        if(str.length() < 2)
            return 2;
        else
            return 0;
    }

    public static int isValidLastName(String str) {
        if(str.isEmpty())
        return 1;
        if(str.length() < 2)
            return 2;
        else
            return 0;
    }

    public static boolean isValidZip(String str) {
        int len = str.length();
        for(int i = 0; i < len; i++) {
            if ((str.charAt(i) < 48) || (str.charAt(i) > 57))
                return false;
        }
        return true;
    }

    public static boolean letterCheck(int ascii)
    {
        return ascii >= 65 && ascii <= 90;
    }

    public static boolean numCheck(char c)
    {
        return (int) c >= 48 && (int) c <= 57;
    }

    public static boolean isValidID(String str) {
        if(letterCheck((int)(str.charAt(0))) && letterCheck((int)(str.charAt(1))))
        {
            if((int)(str.charAt(2)) == 45)
            {
                if(numCheck(str.charAt(3)) && numCheck(str.charAt(4)) && numCheck(str.charAt(4)) && numCheck(str.charAt(4)))
                    return true;
            }
        }
        return false;
    }
    public static void print(String str)
    {
        System.out.println(str);
    }

    public static void validateInput(String str1, String str2, String str3, String str4)
    {
        String msg;

        if(isValidFirstName(str1) == 1) {
            msg = "The first name must be filled in.\n";
            print(msg);
        }
        else if(isValidFirstName(str1) == 2){
            msg = "\""+ str1 + "\" is not a valid last name. It is too short.\n";
            print(msg);
        }

        if (isValidLastName(str2) == 1) {
            msg = "The last name must be filled in.\n";
            print(msg);
        }
        else if (isValidLastName(str2) == 2){
            msg = "\"" + str2 + "\" is not a valid last name. It is too short.\n";
            print(msg);
        }

        if(!(isValidZip(str3))) {
            msg = "The ZIP code must be numeric.\n";
            print(msg);
        }

        if(!(isValidID(str4))) {
            msg = str4 + " is not a valid ID.\n";
            print(msg);
        }

        if((isValidFirstName(str1) == 0) && (isValidLastName(str2) == 0) && (isValidZip(str3)) && (isValidID(str4))) {
            msg = "There were no errors found.";
            print(msg);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name:");
        String str1 = sc.next();
        System.out.println("Enter the last name:");
        String str2 = sc.next();
        System.out.println("Enter the Zip code: ");
        String str3 = sc.next();
        System.out.println("Enter an Employee ID: ");
        String str4 = sc.next();
        validateInput(str1, str2, str3, str4);
    }
}
