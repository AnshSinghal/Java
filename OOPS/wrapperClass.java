package OOPS;

public class wrapperClass {
    int a = 10; //This is a primitive data type
    Integer num = 10; //This is a wrapper class for the primitive data type int    
    //Wrapper classes are used to convert primitive data types into objects
    //The difference between a primitive data type and a wrapper class is that the primitive data type is stored in the stack memory whereas the wrapper class is stored in the heap memory
    //With wrapper classes, you can use the predefined methods of the class like parseInt(), toString(), etc.
    // For example if I type num. and press ctrl+space, I will get a list of predefined methods that I can use with the wrapper class Integer
    //But if I type a. and press ctrl+space, I will not get any predefined methods that I can use with the primitive data type int


    static void swap(Integer a, Integer b){ //Here we are passing the object of the class Integer
        Integer temp = a;
        a = b;
        b = temp;    //Here the value of original a and b should  be swapped. But it will not be swapped

        //public final class Integer
        //above is the declaration of the Integer class. Here the class is declared as final. So we cannot inherit the Integer class
        //Final keyword is used to restrict the user. If a class is declared as final, then it cannot be inherited by any other class 
        //If a method is declared as final, then it cannot be overridden by any other method
        //If a variable is declared as final, then it cannot be changed
        
    }

    static void swap(int a, int b){ //Here we are passing the primitive data type int
        int temp = a;
        a = b;
        b = temp;   //Here the value of original a and b will not be swapped
    }

    public static void main(String[] args) {
        int a = 10; 
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b); //Output: 10 20
        //The value of a and b is not changed because the value of a and b is passed to the function and not the address of a and b
        Integer num1 = 10;
        Integer num2 = 20;
        swap(num1, num2);
        System.out.println(num1 + " " + num2); //Output: 10 20
        //The value of num1 and num2 is not changed.
    }
}

