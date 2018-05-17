package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.println("Enter the day of the week for Monday:");
        // assign input to variable as int
        int number=scanner.nextInt();

        // write completed code here
        if (number==3) System.out.println("Good job!!");
        else System.out.println("Incorrect");
        if (number>7) System.out.println("Remember, there are 7 days in a week!");

    }
}
