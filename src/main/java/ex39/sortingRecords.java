/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Riya Singh
 */
package ex39;

import java.util.*;

public class sortingRecords {

    static Map<String, ArrayList<String>> map = new HashMap<>();

    // Function to sort map by Key
    public static void sortByKey()
    {
        // TreeMap to store values of HashMap
        TreeMap<String, ArrayList<String>> newMap = new TreeMap<>();

        newMap.putAll(map);//copy the data to

        //Print the data
        for (Map.Entry<String, ArrayList<String>> entry : newMap.entrySet()) {
                ArrayList<String> str = entry.getValue();
                System.out.println(str.get(0) + " " + entry.getKey() + " \t\t\t\t\t\t\t|" + str.get(1) + " \t\t\t\t|" + str.get(2));
            }
    }


    public static void main(String args[])
    {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        ArrayList<String> list5 = new ArrayList<>();
        ArrayList<String> list6 = new ArrayList<>();

        list1.add("John");
        list1.add("Manager");
        list1.add("2016-12-31");

        list2.add("Tou");
        list2.add("Software Engineer");
        list2.add("2016-12-31");

        list3.add("Michaela");
        list3.add("District Manager");
        list3.add("2015-12-19");

        list4.add("Jake");
        list4.add("Programmer");
        list4.add("");

        list5.add("Jacquelyn");
        list5.add("DBA");
        list5.add("");

        list6.add("Sally");
        list6.add("Web Developer");
        list6.add("2015-12-18");

        map.put("Johnson", list1);
        map.put("Xiong", list2);
        map.put("Michaelson", list3);
        map.put("Jacobson", list4);
        map.put("Weber", list5);

        System.out.println("Name \t\t\t\t| Postion \t\t\t\t| Separation Date");
        System.out.println("---------------------------------------------------------------------------------------");
        sortByKey();

    }
}

