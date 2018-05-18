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
        float x, r, h, p;

        h = 5.0f;
        r = 3.14f;
        x = (2*r*r*h)+(2*r*r*r);
        p = 2*(3.14f*6.28f + h);


        System.out.println("Perimeter is "+ p);
        System.out.println("The Surface Area is "+x);

    }
}
