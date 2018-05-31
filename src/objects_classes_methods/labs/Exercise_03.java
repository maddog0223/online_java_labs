package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 3:
 *
 *      Create at least three example classes (class1, class2, class3) that demonstrate comfort
 *      in creating multiple classes with multiple methods, and then call between those methods across classes.
 *      These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 *      1) Class1 should have the main method.
 *      2) The main method then needs to create an object of class1, class2, class3.
 *      3) The main method should then  call one or more non-static methods in class2 and class3.
 *
 */

class Class1 {

public static void main(String[]args){
    class1 a = new class1(8,16);
   class2 b = new class2(3,1);
   class3 c = new class3("hello back", 2.3);

    class2 obj = new class2(5,6);
    obj.sweet();

        }

}
    class class1{
    int sleep;
    int awake;
    class1(int s, int a) {
        sleep = s;
        awake = a;
    }

}
    class class2 {

    int cookie;
    int dough;

    class2(int a, int b ) {
        cookie = a;
        dough = b;
    }

    public void sweet(){
        System.out.println("YUM");
    }
        }

        class class3 {
    String hello;
    double num;
    class3(String hello, double num){
        this.hello = hello;
        this.num = num;
    }


        }


