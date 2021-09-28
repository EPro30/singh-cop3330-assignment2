/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */
package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputingStats {
    public static void createList(int n, ArrayList<Integer> numList)
    {
      numList.add(n);
    }
    public static void input(ArrayList<Integer> numList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String str = sc.next();
        int num = 0;
        while((str.compareTo("done") != 0))
        {
            num = Integer.parseInt(str);
            createList(num, numList);
            System.out.println("Enter a number");
            str = sc.next();
        }
    }

    public static int calcMean(ArrayList<Integer> numList)
    {
        int len = numList.size();
        int i, tot = 0;
        for(i = 0; i < len; i++)
        {
            tot = tot + numList.get(i);
        }
        return tot/len;
    }

    public static int calcMin(ArrayList<Integer> numList)
    {
        int temp = numList.get(0);
        int i;
        for(i = 1; i < numList.size(); i++)
        {
            if(numList.get(i) < temp)
                temp = numList.get(i);
        }
        return temp;
    }

    public static int calcMax(ArrayList<Integer> numList)
    {
        int temp = numList.get(0);
        int i;
        for(i = 1; i < numList.size(); i++)
        {
            if(numList.get(i) > temp)
                temp = numList.get(i);
        }
        return temp;
    }

    public static double calcStdDeviation(ArrayList<Integer> numList, int mean)
    {
        int i, sum = 0;
        for(i =0; i < numList.size(); i++)
        {
            sum += (numList.get(i) - mean)*(numList.get(i) - mean);
        }
        double divNum = sum/(numList.size()-1);
        return Math.sqrt(divNum);

    }
    public static void printList(ArrayList<Integer> numList)
    {
        System.out.print("Numbers: ");
        for(int num:numList)
            System.out.println(num + " ");
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> numList = new ArrayList<>();
        input(numList);
        printList(numList);
        int mean = calcMean(numList);
        int min = calcMin(numList);
        int max = calcMax(numList);
        double stdDev = calcStdDeviation(numList, mean);
        System.out.println("The average is " + mean + ".");
        System.out.println("The minimum is " + min +  ".");
        System.out.println("The maximum is " + max + ".");
        System.out.printf("The standard deviation is %.2f.", stdDev);


    }

}
