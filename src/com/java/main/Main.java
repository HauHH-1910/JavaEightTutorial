package com.java.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GAME
 */
public class Main {

    /*
        New Features:
        - Lambda expression - Adds functional processing capability to Java.
        - Method reference - Referencing functions by their names instead of invoking them directly. Using functions as parameter??
        - Default method - Interface to have default method implementation.
        - New tools - New compiler tools and utilities are added like 'jdeps' to figure out dependencies.
        - Stream API - New stream API to faciliate pipeline processing.
        - Date Time API - Improved date time API.
        - Optional - Emphasis on best practices to handle null values properly
        - Nashorn ,JavaScript Engine − A Java-based engine to execute JavaScript code.
     */
    private static Main main = new Main();

    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        firstList.add("Cow");
        firstList.add("Dog");
        firstList.add("Cat");
        firstList.add("Fish");

        List<String> secondList = new ArrayList<>();
        secondList.add("Cow");
        secondList.add("Dog");
        secondList.add("Cat");
        secondList.add("Fish");

        System.out.println("Sort using Java 7 syntax: ");
        main.sortUsingJava7(firstList);
        System.out.println(firstList);
        System.out.println("Sort using Java 8 syntax: ");
        main.sortUsingJava8(secondList);
        System.out.println(secondList);

    }

    //sort using Java 7
    private void sortUsingJava7(List<String> listName) {
        Collections.sort(listName, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    //sort using Java 8
    private void sortUsingJava8(List<String> listName) {
        Collections.sort(listName, (s1, s2) -> s1.compareTo(s2));
    }
}
