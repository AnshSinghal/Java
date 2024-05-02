import java.util.Arrays; // to use Arrays.toString() function
public class variableLengthArgs {
    static void printNumbers(int... numbers) { // variable length arguments
        // numbers is an array of integers
        // to take varibale length arguments, we use the syntax int... numbers
        // we use 3 dots after the data type to indicate that the function can take variable length arguments   
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5);
        // it can take any number of arguments ranging from 0 to n

        // ambiguityFunction(); // This is will give error as it is ambiguous
    }

    // also the variable length arguments should be the last argument in the function   
    // static void printNumbers(int... numbers, int x) { // this will give an error

    // Ambiguity error will occur if we have two functions with same name and same number of arguments
    static void ambiguityFunction(String... v) {
        System.out.println(Arrays.toString(v));
    }
    
    static void ambiguityFunction(int... v) {
        System.out.println(Arrays.toString(v));
    }


    
}
