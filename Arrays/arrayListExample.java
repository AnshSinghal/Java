import java.util.ArrayList;
public class arrayListExample {
    public static void main(String[] args) {
        
        //arrayList is a part of the collection framework and is present in java.util package
        //It provides us dynamic arrays in Java
        //ArrayList is used to take varibale size of arrays
        //Declaration of an ArrayList
        //ArrayList<datatype> arrayListName = new ArrayList<datatype>(initialCapacity);
        //initialCapacity is the initial size of the ArrayList
        ArrayList<Integer> arrayList1 = new ArrayList<>(5);
        //Here the datatype shoul always be a wrapper class and not a primitive data type
        //Wrapper classes are the classes that are used to wrap the primitive data types into objects
        //Wrapper classes are used to convert any data type into an object
        //The primitive data types are not objects, they do not belong to any class, they are defined in the language itself
        //Wrapper classes provide a way to use primitive data types as objects
        //The object of the wrapper class contains or wraps its respective primitive data type
        //Wrapper classes include Boolean, Character, Integer, Double, etc
        //The object of the wrapper class can be null
        //The wrapper classes are immutable
        //The wrapper classes have many utility methods
        //The primitive data types are passed by value and the wrapper classes are passed by reference


        // Adding elements to the ArrayList
        // add() method is used to add elements to the ArrayList
        arrayList1.add(10);

        // Printing the ArrayList
        System.out.println(arrayList1); 

        // Adding elements at a specific index
        // add(index, element) method is used to add elements at a specific index
        arrayList1.add(1, 20);
        arrayList1.add(2, 30);
        arrayList1.add(3, 40);
        arrayList1.add(4, 50);

        //Replacing an element at a specific index
        // set(index, element) method is used to replace an element at a specific index
        arrayList1.set(1, 30);

        // Removing an element at a specific index
        // remove(index) method is used to remove an element at a specific index
        arrayList1.remove(1);

        // Getting the size of the ArrayList
        // size() method is used to get the size of the ArrayList
        System.out.println(arrayList1.size());

        // Getting the element at a specific index
        // get(index) method is used to get the element at a specific index
        System.out.println(arrayList1.get(0));
        //Or
        for(int i: arrayList1){
            System.out.println(i);
        }


    
    
    }
}
