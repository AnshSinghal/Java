import java.util.*;

// in java there is pass by value not pass by reference
// in pass by value the value of the variable is passed to the function and the function works on the value of the variable
// in pass by reference the address of the variable is passed to the function and the function works on the address of the variable
// in java the value of the variable is passed to the function so it is pass by value

//primitive data types are those data types which are predefined in java and are not created by the user
//primitive data types are int, float, double, char, boolean, long, short, byte
//non primitive data types are those data types which are created by the user
//non primitive data types are arrays, classes, interfaces, strings
//primitive data types are stored in stack memory and non primitive data types are stored in heap memory
//primitive data types are faster than non primitive data types
//primitive data types are not null but non primitive data types can be null
//primitive data types are not objects but non primitive data types are objects
//primitive data types are not synchronized but non primitive data types are synchronized 
// which means that only one thread can access the object at a time  
// for example in the case of strings only one thread can access the string at a time      

// When passing primitives (like int) or immutable objects (like strings), changes inside the function won't affect the original variable.
// When passing mutable objects (like arrays), changes to the elements of the object will be reflected in the original variable because they both refer to the same underlying data.

public class functions {

    public static void printMyName(String name) {
        System.out.print(name);
        return; // not necessary to write return in void functions
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Hello World!";
        int[] arr = { 1, 2, 3, 4, 5 };

        printMyName(name);
        changeName(name);
        changeArray(arr);

        System.out.println(name); // here the value of name is not changed because the value of name is passed to
                                  // the function
        System.out.println(arr[0]); // here the value of arr[0] is changed because the address of arr[0] is passed
                                    // to the function
    }
    // this happens because in java the value of the variable is passed to the
    // function and not the address of the variable
    // so the function works on the value of the variable and not the address of the
    // variable
    // so the value of the variable is not changed but the value of the array is
    // changed
    // this is called pass by value

    static void changeName(String naam) {
        naam = "Rahul";

    }

    static void changeArray(int[] sampleArray) {
        sampleArray[0] = 99;
    }

}

// differnce in functions and methods is that functions are not part of any
// class and methods are part of class
// for example in python we have functions and in java we have methods
// functions are also called procedures in some languages
// printMyName is a function in this case and main is a method
// another difference is that functions are called by their name and methods are
// called by their object
// for example here printMyName is called by its name and main is called by its
// object. here the obejc is the class itself
