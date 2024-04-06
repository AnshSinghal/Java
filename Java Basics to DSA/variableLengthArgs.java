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
    }
    
    
}
