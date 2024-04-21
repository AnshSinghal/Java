package OOPS.singletoneClass;

public class singletone { // A class that can have only one object (an instance of the class) at a time
    private static singletone obj; // Create an object of the class
    private singletone(){} // Make the constructor private so that this class cannot be instantiated
    public static singletone getInstance(){ // Get the only object available
        if (obj == null){
            obj = new singletone();
        }
        return obj;
    }
    
}
