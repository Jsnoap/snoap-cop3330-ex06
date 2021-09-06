/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Program to return what year and how many years until you can retire based off of user input.
    public static void main( String[] args )
    {
        int age, retireAge;

        Date d = new Date();
        int year = d.getYear();
        year = year + 1900;

        System.out.println("What is your current age?");
        Scanner inputAge = new Scanner(System.in);
        age = inputAge.nextInt();

        System.out.println("At what age would you like to retire?");
        Scanner inputRetire = new Scanner(System.in);
        retireAge = inputRetire.nextInt();

        System.out.println("You have " + (retireAge - age) + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in " + (year + (retireAge - age)) + "." );
    }
}
