/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */
package ex32;

import java.util.Random;
import java.util.Scanner;

public class GuessNumGame {

    public static boolean numCheck(String str)
    {
        int len = str.length();
        int i, ascii;
        for(i = 0; i < len; i++)
        {
            ascii = (int)(str.charAt(0));
            if(ascii < 49 || ascii > 57 )
                return true; //the input string is a non-numeric value
        }
        return false; //string is numeric
    }

    public static void guessGame(int n)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int counter = 0;
        int max = 1;
        if( n == 1)
            max = 10;
        else if( n == 2)
            max = 100;
        else if( n == 3)
            max = 1000;
        else
            System.out.println("Invalid input");

        int myNum = rand.nextInt(max)+1;
        int guess = 0;

        System.out.println("I have my number. What's your guess?");
        String str = sc.next();
        if(numCheck(str))
            System.out.println("Please enter numbers within the given range");
        else
            guess = Integer.parseInt(str);
        while(myNum != guess)
        {
            if (guess < myNum)
               System.out.println("Too Low. Guess again: ");
            else if (guess > myNum)
                System.out.println("Too high. Guess again: ");
            counter++;

            str = sc.next();
            if(numCheck(str))
                System.out.println("That is not valid. Please enter a number.");
            else
                guess = Integer.parseInt(str);
        }
        System.out.println("You got it in " + counter + " guesses!");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        int level = 0;
        System.out.println("Let's play Guess the Number.");
        do {
            System.out.println("Pick a difficulty level (1, 2, or 3):");
            str = sc.next();
            if (numCheck(str))
                System.out.println("Please enter numbers within the given range");
            else
                level = Integer.parseInt(str);
            guessGame(level);
            System.out.println("Play again?(y or n): ");
            str = sc.next();
        }while((int)str.charAt(0) == 121);
        System.out.println("Goodbye!");
    }
}
