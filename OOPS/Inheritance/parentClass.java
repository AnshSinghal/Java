package OOPS.Inheritance;

public class parentClass {
    private int pvt;
    int superVariable = 1;
    int x;
    int y;
    int z;

    // cunstructor to initialize these values
    public parentClass() { // default constructor it is necessary to create a no argument constructor in
                           // parent class
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    parentClass(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Parent Class Constuctor");
    }

    parentClass(int superVariable){
        this.superVariable = superVariable;
    }

    final void finalMethod() {
        System.out.println("This is a final method");
    }

    

}

final class finalClass {
    // final class cannot be inherited
}
