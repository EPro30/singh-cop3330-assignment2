/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */
package ex34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeListRemoval {
    public static void createList(List<String> list)
    {
        list.add("John Smith");
        list.add("Jackie Jackson");
        list.add("Chris Jones");
        list.add("Amanda Cullen");
        list.add("Jeremy Goodwin");
    }

    public static void removeElement(List<String> list, String str)
    {
        list.remove(str);
    }

    public static void print(List<String> list)
    {
       for(String name:list)
       {
           System.out.println(name);
       }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        createList(list);
        print(list);
        System.out.println("Enter an Employee name to remove: ");
        String str = sc.nextLine();
        removeElement(list, str);
        print(list);

    }
}

