/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */
package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class FilteringValues {
    public static boolean isEven(int num)
    {
        return num%2 == 0;
    }
    public static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> list)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int len = list.size();
        int i;
        for(i = 0; i < len; i++)
        {
            if(isEven(list.get(i)))
                temp.add(list.get(i));
        }
        return temp;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> oldList = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();

        System.out.println("Enter a list of numbers, separated by spaces: ");
        String str = sc.nextLine();
        int i;
        String[] strArr = str.split("\\s+");
        for(i = 0; i < strArr.length; i++)
        {
            String temp = strArr[i];
            oldList.add(Integer.parseInt(temp));
        }
        newList = filterEvenNumbers(oldList);
        System.out.println("The even numbers are ");
        for(int n:newList)
            System.out.print(n + " ");
    }
}
