/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */

package ex26;

import java.util.Scanner;
import java.lang.Math;

public class CreditCard {

    public static double calculateMonthsUntilPaidOff(String bal, String apr, String pmnt)
    {
        double b = Double.parseDouble(bal);
        double i = ((Double.parseDouble(apr))/100);
        double j = (i/365)+1;
        double p = Double.parseDouble(pmnt);
        double a = 1.0/30.0;
        double g = Math.log10(j);
        double c = Math.pow(j, 30);
        double d = b/p;
        double e = d*(1-c);
        double f = Math.log10(1+e);
        double n = (-a*f)/g;
        return(Math.ceil(n));

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your balance?");
        String b = sc.next();
        System.out.println("What is the APR on the card (as a percent)?");
        String apr = sc.next();
        System.out.println("What is the monthly payment you can make?");
        String p = sc.next();

        int mnths = (int)(calculateMonthsUntilPaidOff(b, apr, p));
        System.out.println("It will take you " + mnths + " months to pay off this card.");
    }
}
