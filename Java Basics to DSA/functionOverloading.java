public class functionOverloading {
    // function overloading is when we have multiple functions with the same name but different parameters
    // function overloading is also called compile time polymorphism
    // function overloading is not possible by changing the return type of the function
    // function overloading is possible by changing the number of arguments or the type of arguments
    static void fun(int a){
        System.out.print(a+3);
    }
    static void fun(int a, int b){
        System.out.print(a+b);
    }
    static void fun(String a){
        System.out.print(a);
    }

    public static void main(String[] args) {
        fun(3);
        fun(3, 4);
        fun("Hello World!");
    }

    // Ambiguity in function overloading is when the compiler is confused about which function to call
    
    
}
