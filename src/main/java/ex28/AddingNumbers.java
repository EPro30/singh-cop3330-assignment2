/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */

package ex28;

import java.util.Scanner;

public class AddingNumbers {
    public static int sum(int tot, int n)
    {
        return tot + n;
    }

    //Works with user input
    //Works with negative and positive integers
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tot = 0, n;
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            tot = sum(tot, n);
        }
        System.out.println("The total is " + tot + ".");
    }
}
