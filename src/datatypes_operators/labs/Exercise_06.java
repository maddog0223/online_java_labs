package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 6: 2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        int[][] twoDArray = {
                {3,6,9,12,15},
                {18,21,24,27,30},
                {33,36,38,42,45},
                {48,51,54,57,60},
                {63,66,69,72,75}
        };



        for (int i = 0; i < 5; i++) {

            for (int x = 0; x < 5; x++) {
            }
        }

        for (int i = 0; i < 5; i++) {

            for (int x = 0; x < 5; x++) {

                System.out.print(twoDArray[i][x] + " ");

                }
            System.out.println("\n");

        }


    }
}

