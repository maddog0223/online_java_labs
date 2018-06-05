package inheritance.labs;

class Class1Fastfood {

    private int a1;
    private int b1;

    //Constructors

    Class1Fastfood(int a1, int b1) {

        this.a1 = a1;
        this.b1 = b1;
    }


    // overloading constructor

    Class1Fastfood(String chickentender){


    }


    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    // instruction 3

    public static void main(String[] args) {

        Class2McDonalds rate = new Class2McDonalds(8,8);

        rate.setLook(8);

        Class3Wendys.notgetorset();


    }


}
