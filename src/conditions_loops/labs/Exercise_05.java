package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String args[]) {
        int sum = 0;
        double a;
        double b;
        Scanner key = new Scanner(System.in);


        System.out.println("Enter any number");

        a = key.nextDouble();

        System.out.println("Enter a number higher than the first number");

        b = key.nextDouble();

        double avg = (a+b)/2;

        while (a <= b) {

            sum += a;

            a++;
        }




        System.out.println("The sum is " + sum + " and the average is " + avg);
    }

}



