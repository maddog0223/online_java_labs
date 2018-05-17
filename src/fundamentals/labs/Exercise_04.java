package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        double x, r, h, q;

        h = 5.0;
        r = 3.14;
        x = r*r*r*2+2*r*r*h;
        q=2*r*r+2*r*r+12;


        System.out.println("Perimeter is "+r*h);
        System.out.println("The Area is "+x);

    }
}
