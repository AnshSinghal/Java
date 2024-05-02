// Create a Java Program which will ask user to enter two floating numbers as input and
// will print their product.


package Java_Practice_Questions;
import java.util.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two floating numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float product = a * b;
        System.out.println("Product of " + a + " and " + b + " is " + product);
    }
    
}
