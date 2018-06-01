package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */

class Method {

    int s;
    int y;

        //1
        public static void static1 () {

            itsstatic(4);

        }

        //2
        public static void static2 () {

            Method obj1 = new Method();
            obj1.itsnstatic(6);

        }

        //3
        public void nstatic1(){

          m1(4);
        }


        //static method
        public static void itsstatic(int a) {
            int s = a;
            System.out.println(s);
    }

        //nonstatic method
        public void itsnstatic(int b){

            int d = b;
            System.out.println(b);
    }

    //another non static method for #3. The method that returns
    public int m1(int q){

            int y = q;
            return y;

    }
}

class D{
    int q;
    int e;
    //4

    public int method1(int r){
        q = r;

        method2(4);
        System.out.println(method2(3));
        return q;
    }

    public int method2(int d){

        e = d*3;
        method1(6);
        return e;


    }
}
