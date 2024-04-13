package JavaPackages;

public class Human {
    int age;
    String name;
    int salary;
    static int population = 0; // static variable to keep track of the number of objects created
    // static variable is shared among all objects of the class and is accessed
    // using the class name
    // static variables are initialized only once at the start of the execution
    // Difference in static and non-static variables is that non-static variables
    // are initialized every time an object is created whereas static variables are
    // initialized only once

    // When a member is declared as static, it can be accessed before any objects of
    // its class are created and without reference to any object

    // You can declare both variabl and method as static.

    // Why Main method is static in Java?
    // The main method is static in Java because the object is not required to call
    // a static method. If it were a non-static method, JVM creates an object first
    // then call main() method that will lead to the problem of extra memory
    // allocation.
    // The static method is the part of the class not the object of the class. A
    // static method in Java belongs to the class rather than the object of a class.
    // A static method can access only static data. It cannot access non-static data
    // (instance variables). A static method can call only other static methods and
    // can not call a non-static method from it. A static method can be accessed
    // directly by the class name and doesn’t need any object. For example, in the
    // following code, we call the static method m1() using the class name.

    public Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population++; // incrementing the population every time an object is created
    }

    // this is not a static method. so, it can be accessed only by the object of the
    // class
    void greet() {
        System.out.println("Hello, I am " + this.name);
        greetAll(); // This will work because greetAll() is a static method and can be accessed by the
                    // class name
    }

    // this is a static method. so, it can be accessed by the class name
    static void greetAll() {
        System.out.println("Hello everyone!");
        // greet(); // Error: non-static method greet() cannot be referenced from a static
        // context

        // greet() is not a static method. So, it can be accessed only by the object of the class
        Human object = new Human(20, "John", 1000);
        object.greet(); 
    }

    public static void main(String[] args) {
        // greet() // Error: non-static method greet() cannot be referenced from a
        // static context
        greetAll(); // Hello everyone!
    }
}
