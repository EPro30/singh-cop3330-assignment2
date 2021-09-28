/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */
package ex37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class passwordGenerator {

    public static int numberGenerator(int min, int max)
    {
        return ((int)(Math.random()*(max - min))) + min;
    }

    public static String generatePassword(int len, int numChars, int nums, ArrayList<String> list)
    {
        int numLetters = len - (numChars + nums);
        int i;
        String password = "";
        for(i = 0; i < nums; i++)
        {
            list.add(String.valueOf(numberGenerator(0,10)));
        }
        char[] arr = {'!', '@', '#', '%', '&', '$'};
        for(i = 0; i < numChars; i++)
        {
            list.add(String.valueOf(arr[numberGenerator(0,6)]));
        }
        for(i = 0; i < numLetters; i++ )
        {
            list.add(String.valueOf((char)(numberGenerator(97,122))));
        }
        Collections.shuffle(list);
        for(i = 0; i < len; i++)
        {
            password += list.get(i);
        }
        return password;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("What is the minimum length? ");
        int len = sc.nextInt();
        System.out.println("How many special character? ");
        int numChars = sc.nextInt();
        System.out.println("How many numbers? ");
        int nums = sc.nextInt();
        String password = generatePassword(len, numChars, nums, list);
        System.out.println("your password is \n" + password);
    }
}
