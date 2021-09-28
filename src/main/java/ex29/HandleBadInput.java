/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */

package ex29;

import java.util.Scanner;

public class HandleBadInput {
    public static boolean numCheck(char c)
    {
        if((int)c < 49 || (int)c > 57)
            return true;
        return false;
    }

    public static int calcYears(int r)
    {
        return 72/r;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the rate of return?");
        String str = sc.next();
        while(numCheck(str.charAt(0)))
        {
            System.out.println("What is the rate of return?");
            str = sc.next();
        }
        int years = calcYears(Integer.parseInt(str));
        System.out.println("It will take " + years + " year(s) to double your initial investment.");

    }
}
