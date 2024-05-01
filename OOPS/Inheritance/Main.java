package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        childClass obj = new childClass();
        obj.x = 1; // parent class variable
        obj.a = 2; // child class variable
        System.out.println(obj.a + " " + obj.b); // 0 0

        // obj.pvt = 10; // error because pvt is private
        // calling parent class constructor
        childClass obj1 = new childClass(1, 2, 3, 4, 5, 6);
        System.out.println(obj1.x + " " + obj1.y + " " + obj1.z + " " + obj1.a + " " + obj1.b + " " + obj1.c); // 1 2 3
                                                                                                               // 4 5 6

        // it is the type of the referce variable that determines what memebers can be
        // accessed
        // parent class reference can only access parent class members
        parentClass obj2 = new childClass();
        obj2.x = 10;
        //obj2.display() // error because display() is a child class method
        // obj2.a = 5;
        //Upcasting in java means creating object of child class with parent class reference

        // childClass obj3 = new parentClass(); // error
        // There are many variables in child class that are not in parent class so it is
        // not possible to create object of child class with parent class reference

        //super() keyword is also used to accces the parent class constructor
        //it can also help us to access the parent class variables

        childClass superObj = new childClass(10);








    }
}

class childClass extends parentClass {

    // void finalMethod() {} //final method cannot be overridden

    // this.pvt = 0; // error because pvt is private
    int superVariable = 2;
    int a;
    int b;
    int c;

    childClass() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.x = 0;
        // this.pvt = 0; // error because pvt is private
    }

    // Suppose i want to set the value of both parent class and child class
    // variables
    // then i have to create a constructor in child class
    childClass(int x, int y, int z, int a, int b, int c) {
        super(x, y, z); // calling parent class constructor
        // super keyword is used to call parent class constructor
        this.a = a;
        this.b = b;
        this.c = c;
    }

    childClass(int superVariable){
        this.superVariable = superVariable;
        System.out.println("Child Class Constructor");
        System.out.println("Super Variable: " + super.superVariable);
        System.out.println("Child Class Variable: " + this.superVariable);
    }

    void display() {
        System.out.println("This is a child class");
    }
}

// class hello extends finalClass {} // error because final class cannot be inherited