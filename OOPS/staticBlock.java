package OOPS;


public class staticBlock {
    static int a = 4;
    static int[] arr = {1,2,3,4,5,6,7,8,9};
    static int b = hello();

    static { // static block is used to initialize the static variables of the class
        // static block is executed before the main method and only once when the first
        // object is created i.e. when the class is loaded
        // The static block handles file loading and potential errors for config values.
        System.out.println("Static block initialized.");
        b = a*5;
        //static block is kind of constuctor which is called ony once when the class is loaded
        //it can handle complex initialization of static variables for example, database connection etc.
    }

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println("Value of a: " + staticBlock.a + " Value of b: " + staticBlock.b);
        //Here the values of a and b are 4 and 20 respectively

        staticBlock.b+=5;
        System.out.println("Value of a: " + staticBlock.a + " Value of b: " + staticBlock.b);
        //Here the values of a and b are 4 and 25 respectively

        staticBlock obj2 = new staticBlock();
        System.out.println("Value of a: " + staticBlock.a + " Value of b: " + staticBlock.b);
        //Here the values of a and b are 4 and 25 respectively
        // Notice that that here the value of b is not reinitialized to 20 as the static block is executed only once
    }

    static int hello() {
        return 7;
    }


}
