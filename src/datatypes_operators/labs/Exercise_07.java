package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        int irreg[][] = {

                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10,}
        };


        for (int[] a : irreg) {

            for (int b : a) {

                System.out.print(b);

            }
            System.out.println("\n");

        }

    }
}


