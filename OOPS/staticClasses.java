package OOPS;
//static nested classes are used to associate a class with its outer class.

//It can access the static members of the outer class including private.
//It cannot access the instance members of the outer class.
//It can be declared as private, protected, public, or default.
//It can be declared as abstract or final.
//It can extend other classes and implement interfaces.
//It cannot declare static members or interfaces.
//It can access the members of the outer class including private.

//Inner classes are non-static nested classes. They have access to the members of the outer class.
//They cannot declare static members.
//They can access the static members of the outer class.

//Objecta are created at runtime and static methods or classes or varibales have nothing to do with objects
//Therefore, static stuff is resolved at compile time. So, static nested classes can be accessed without creating an object of the outer class.

class OuterClass {
    private int data = 10;
    private static int staticData = 20;

    class InnerClass { // Inner Class can access both static and instance members of the outer class
        public void accessOuterData() {
            System.out.println("Inner Class accessing outer class data: " + data);
            System.out.println("Inner Class accessing outer class data: " + staticData); // this will work here because
                                                                                         // staticData is static
                                                                                         // variable and we can use a
                                                                                         // static context in non static
                                                                                         // context
        }
    }

    static class StaticNestedClass { // Static Nested Class can access only static members of the outer class (not
                                     // instance members)
        public void accessOuterStaticMethod() {
            System.out.println("Static Nested Class calling outer class static method: " + someStaticMethod());
            // System.out.println("Static Nested Class calling outer class static method: "+
            // data);
            // Error: non-static variable data cannot be referenced from a static context
            System.out.println("STatic nested class class calling static varibale of outer class: " + staticData);
        }

        static int someStaticMethod() {
            return 100;
        }
    }
}

public class staticClasses {
    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();

        // Inner Class Usage (requires outer class object)
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessOuterData(); // Output: Inner Class accessing outer class data: 10

        // Static Nested Class Usage (doesn't require outer class object)
        OuterClass.StaticNestedClass staticObject = new OuterClass.StaticNestedClass();
        staticObject.accessOuterStaticMethod(); // Output: Static Nested Class calling outer class static method: 100
    }

}
