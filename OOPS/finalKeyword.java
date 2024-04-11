package OOPS;

//Final keyword is used to restrict the user. If a class is declared as final, then it cannot be inherited by any other class
//If a method is declared as final, then it cannot be overridden by any other method
//If a variable is declared as final, then it cannot be changed


public class finalKeyword {
    public static void main(String[] args) {
        final int num = 41; //This is a final variable
        // The data type of the above variable is int, so it is a primitive data type
        // Its value cannot be changed
        // num = 42; //This will give an error because we cannot re assign the value.
        final student ansh = new student(); //Here ansh is also a final variable
        // The data type of the above variable is object.
        ansh.name = "Ansh"; //This is allowed because we are not changing the reference of the object
        //But we cannot re initialize the object
        // ansh = new student(); //This will give an error

        //finalize() method is called by the garbage collector when the object is destroyed
        //It is called just before the object is destroyed by the garbage collector
        //whenevr the object is destroyed, the finalize() method is called
        for (int i = 0; i < 1000000; i++) {
            student s = new student();
        }
        
    }
}

class student{
    String name;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}




