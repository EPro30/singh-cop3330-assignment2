/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */

package ex24;

import java.util.Scanner;


public class anagram {

    public static boolean isAnagram(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1 == len2)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.println("Enter the first string: ");
        String str1 = sc.next();
        System.out.println("Enter the second string: ");
        String str2 = sc.next();
        if( isAnagram(str1, str2))
            System.out.println("\"" + str1 + "\" and \"" +  str2 + "\" are anagrams.");
        else
            System.out.println("\"" + str1 + "\" and \"" +  str2 + "\" are not anagrams.");
    }
}
