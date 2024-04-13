package JavaPackages;

import static Arrays.swapArray.swap;

public class JavaPackagesIntro {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        swap(arr, 1, 2);

        Human A = new Human(20, "John", 1000); // no need to import Human class as it is in the same package
        Human B = new Human(30, "Doe", 2000);
        System.out.println(Human.population); // 2
        // By convention, do not write A.population or B.population as population is a
        // static variable and is shared among all objects of the class
        // By convention, write Human.population to access the static variable

        // greet() is not a static method. So, it can be accessed only by the object of the class
        A.greet(); // Hello, I am John
        // greetAll() is a static method. So, it can be accessed by the class name
        Human.greetAll(); // Hello everyone!
    }
}
