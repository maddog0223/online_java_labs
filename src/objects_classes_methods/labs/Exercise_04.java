package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */
class Gather {

    public static void main(String[] args) {

        Overload.over1("hi");
        Overload.over1(8);
        Overload.over1(3,5);


    }


}



class Overload {

        public static void over1(int a, int b) {
            int sum = a+b;
        }

        public static void over1(int a) {
            int sum = a;
        }

        public static void over1(String c) {
            String sum = c + c;
            System.out.println(sum);
        }

    }
