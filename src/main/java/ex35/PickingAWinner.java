/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */
package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PickingAWinner {
    public static int numberGenerator(int n)
    {
        Random rand = new Random();
        return rand.nextInt(n);
    }
    public static void addElements(ArrayList<String>  namesList, String str)
    {
        namesList.add(str);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String str;
        System.out.println("Enter a name: ");
        str = sc.nextLine();
        while(!(str.isEmpty()))
        {
            addElements(list, str);
            System.out.println("Enter a name: ");
            str = sc.nextLine();
        }
        int myNum = numberGenerator(list.size());
        System.out.println("The winner is..." + list.get(myNum) + ".");
    }
}
