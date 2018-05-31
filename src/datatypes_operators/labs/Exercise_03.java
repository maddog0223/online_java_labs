package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 3: Pig latin
 *
 *      Take in the user's name and print out their name translated to pig latin.
 *      For the purpose of this program, we will say that any word or name can be
 *      translated to pig latin by moving the first letter to the end, followed by "ay".
 *      For example: ryan -> yanray, caden -> adencay
 *
 *      HINT: We will make use of the substring() method.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a name: ");
        // assign input to variable as int
        String word = scanner.next();
        // write code here
        String first = word.substring(0,1);
        String middle = word.substring(1,word.length());
        String pig = middle + first + "ay";
        System.out.println(pig);
    }
}


