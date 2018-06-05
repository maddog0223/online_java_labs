package inheritance.labs;

 class Class2McDonalds extends Class1Fastfood {

    private int taste;
    private int look;

    Class2McDonalds(int taste, int look){

        super("pretty crispy");

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

        System.out.println("Fast foods can be good");
    }

}
