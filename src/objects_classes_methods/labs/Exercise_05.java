package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */



class A {

    String a;
    static int stat;

    public A(String growth) {

        this.a = growth;

        stat++;
        System.out.println(growth);
        System.out.println(stat);
    }


}

class Object {

    public static void main(String[] args) {

            A name1 = new A("Caterpillar");

            A name2 = new A("Cocoon");

            A name3 = new A("Butterfly");





    }

}
