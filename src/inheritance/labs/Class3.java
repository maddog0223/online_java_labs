package inheritance.labs;

 class Class3Wendys extends Class1Fastfood {

    private int taste;
    private int look;

    Class3Wendys(int taste, int look){

        super("not that crispy");

        this.taste = taste;
        this.look = look;

    }

    public int getTaste() {
        return taste;
    }

    public void setTaste(int taste) {
        this.taste = taste;
    }

    public int getLook() {
        return look;
    }

    public void setLook(int look) {
        this.look = look;
    }


    //4

    public static void notgetorset(){

        System.out.println("Their shakes are cheap");

    }

    //method overloading
    public static void notgetorset(String shake){

        System.out.println("The shakes are cheap");
    }
}
