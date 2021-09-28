/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */

package ex33;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static int numberGenerator()
    {
        Random rand = new Random();
        return rand.nextInt(4);
    }

    public static String getResponse(int n)
    {
        String[] response = { "Yes.", "No.", "Maybe.", "Ask again later."};
        return response[n];
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("What's your question? ");
        String quest = sc.nextLine();
        int myNum = numberGenerator();
        String msg = getResponse(myNum);
        System.out.println(msg);
    }
}
