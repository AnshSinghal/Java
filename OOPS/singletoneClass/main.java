package OOPS.singletoneClass;

public class main {
    public static void main(String[] args) {
        // singletone obj1 = new singleton(); // Compile time error: The constructor singleton() is not visible
        singletone obj1 = singletone.getInstance();
        singletone obj2 = singletone.getInstance();
        System.out.println(obj1==obj2); // true
        // both obj1 and obj2 are same as they are pointing to the same object
    }
    
}
