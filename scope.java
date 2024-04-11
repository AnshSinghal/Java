public class scope {

    int a = 10; // a is defined in the class scope  
    // Scope is the region of the program where a variable is defined.
    // function scope is the region of the program where a variable is defined in a function.   

    static void functionScope() { // function scope
        int a = 20; // a is defined in the function scope
        System.out.println(a);
    }   


    // block scope is the region of the program where a variable is defined in a block.
    // a block is defined by curly braces.
    {
        a = 40; // here the value of a from the class scope is changed to 40
        int a = 30;  //here a new variable a is defined in the block scope
        System.out.println(a);
        int y = 40;
    } // this is a block

    public static void main(String[] args) {
        System.out.println(a); // prints 40 because a is defined in the class scope
        functionScope(); // prints 20 because a is defined in the function scope
        // System.out.println(y); // this will give an error because y is defined in the block scope
    }
}
