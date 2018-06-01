package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_04{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("In this program you're going enter 10 numbers and I'm going to find the sum");

        int sum = 0;

        for (int i = 0; i<10; i++) {

            System.out.println( "Please enter number" + (i + 1));

            sum += scanner.nextInt();

        }

        double average = (sum/10);


        System.out.println("The sum is " + sum + " and the average is " + average);

    }

}