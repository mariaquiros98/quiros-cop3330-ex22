/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;
import java.lang.*;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        int first;
        int second;
        int third;

        /*Prompting for first number*/
        System.out.println("Enter the first number:");
        first = scan.nextInt();

        /*Prompting for second number*/
        System.out.println("Enter the second number:");
        second = scan.nextInt();

        /*Prompting for third number*/
        System.out.println("Enter the third number:");
        third = scan.nextInt();

        /*Writing if else statement to determine whether the numbers are the same and if not, which one is the largest*/
        if ((first == second) && (first == third)) {
            System.exit(0);
        } else if ((first > second) && (first > third)) {
            System.out.println("The largest number is " + first + ".");
        } else if ((second > first) && (second > third)) {
            System.out.println("The largest number is " + second + ".");
        } else {
            System.out.println("The largest number is " + third + ".");
        }
    }
}




