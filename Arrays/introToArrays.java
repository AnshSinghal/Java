package Arrays;
import java.util.*; // to use Arrays.toString() function

public class introToArrays {
    public static void main(String[] args) {
        // Arrays are used to store multiple values in a single variable
        // Arrays are of fixed size in Java
        // Syntax to declare an array:
        // datatype[] arrayName = new datatype[size];
        // datatype[] arrayName = {value1, value2, value3, ...};
        // datatype[] arrayName = new datatype[]{value1, value2, value3, ...};
        // datatype[] arrayName = new datatype[size]{value1, value2, value3, ...}; // This is invalid

        // Example:
        int[] marks = new int[5]; // Array of size 5
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 80;
        marks[3] = 70;
        marks[4] = 60;
        // or
        int[] marks2 = {100, 90, 80, 70, 60};

        //Declaration of an Array
        int[] array1; // This is just a declaration. array1 is getting defined in the stack memory
        // This takes place at complie time



        //Initialization of an Array
        array1 = new int[5]; // This is initialization. Here the object is getting created in the heap memory
        // This takes place at runtime
        // ALso called as Dynamic Memory Allocation

        //1. Array objecta are in Heap memory : Heap Memory is a memory that is shared among all the threads of the application
        //      Its like a pile of objects. When an object is created, it is added to the pile.
        //2. Heap objects are not contiguous : They are scattered in the heap memory
        //3. Dynamic Memory Allaocation : The size of the array is not fixed at compile time. It is decided at runtime
        //4. Array object is created using the new keyword : new keyword is used to create an object in the heap memory

        // By default all the elements of the Integer array are initialized to 0 and all the elements of the boolean array are initialized to false
        // Similarily all the elements of the String array are initialized to null and all the elements of the char array are initialized to '\u0000'


        int lengthOfArray = marks.length; // length is a property of the array
        System.out.println(lengthOfArray); // 5

        //Enhanced for loop
        for(int i : marks){
            System.out.println(i);
        }

        //Printing an Array
        System.out.println(marks); // This will print the address of the array
        // we use Arrays.toString() function to print the array
        System.out.println(Arrays.toString(marks)); // [100, 90, 80, 70, 60]


        //2D Arrays 
            // Syntax to declare a 2D array:
            // datatype[][] arrayName = new datatype[rowSize][columnSize];
        // It is not necessary to mention the column size in the declaration
        int[][] array2D = new int[3][]; // 3 rows and column size is not mentioned
        int[][] array2D2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 3x3 2D array

        Scanner sc = new Scanner(System.in);

        //taking input for 2d array
        for(int row = 0; row<array2D2.length; row++){
            for(int col=0 ; col<array2D2[row].length;col++){
                System.out.println("Enter the element for row " + row + " and column " + col);
                array2D2[row][col] = sc.nextInt(); // taking input as 5 for all the elements
            }
        }
        

        for(int[] i: array2D2){    
            System.out.println(Arrays.toString(i));
        }   
    
    }
}
