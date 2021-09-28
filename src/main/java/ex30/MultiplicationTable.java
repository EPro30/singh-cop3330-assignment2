/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */

package ex30;

public class MultiplicationTable {
    public static int product(int i, int j)
    {
        return i*j;
    }

    public static void main(String[] args)
    {
        int i, j, prdct;
        for(i = 0; i < 13; i++)
        {
            for(j = 0; j < 13; j++)
            {
                prdct = product(i, j);
                System.out.println(i + " * " + j + " = " + prdct);
            }
        }
    }
}
