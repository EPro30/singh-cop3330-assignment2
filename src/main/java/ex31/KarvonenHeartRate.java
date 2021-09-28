/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */

package ex31;

import java.util.Scanner;

public class KarvonenHeartRate {

    public static int calcHeartRate(int rp, int n, double i)
    {

        double restHR = (double)rp, age = (double)n;
        int hr;
        hr = (int)((((220.0-age)- restHR) * i)+restHR);
        return hr;
    }

    public static void print(int hr, double counter)
    {
        System.out.println((int)(counter*100) + "% \t\t | " + hr + " bpm");
    }

    public static void main(String[] args)
    {
        double i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Resting Pulse: ");
        int rp = sc.nextInt();
        System.out.println("Age: ");
        int age = sc.nextInt();
        int hr;
        System.out.println("Intensity\t | Rate\n-------------|------");
        for(i = 0.55; i < 0.96;)
        {
            hr = calcHeartRate(rp, age, i);
            print(hr, i);
            i = i + 0.05;
        }
    }
}
