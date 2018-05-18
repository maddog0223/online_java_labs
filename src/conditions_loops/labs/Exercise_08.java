package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {

    public static void main(String args[]) {

        int a, b;

        a = 1000;
        b = 3;


        do {
            System.out.println(a-b);
            a -=  b;
        }
        while (a >= 4);
    }

}
