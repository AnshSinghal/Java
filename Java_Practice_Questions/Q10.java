// Create a Java Program that will provide a basic calculator to user. It will provide user
// with choice of selecting a particular mathematical operation, from a set of operations, to
// be applied upon on two input integer values provided by the user and will return the
// result. Develop this program using the concept of infinite while loop, break statement,
// System.exit() statement and switch case.


package Java_Practice_Questions;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            switch (sc.nextLine()) {
                case "+":
                    System.out.println("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Sum: "+(a+b));                    
                    break;
                case "-":
                    System.out.println("Enter two numbers: ");
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    System.out.println("Difference: "+(c-d));                    
                    break;
                case "*":
                    System.out.println("Enter two numbers: ");
                    int e = sc.nextInt();
                    int f = sc.nextInt();
                    System.out.println("Product: "+(e*f));                    
                    break;
                case "/":
                    System.out.println("Enter two numbers: ");
                    int g = sc.nextInt();
                    int h = sc.nextInt();
                    System.out.println("Quotient: "+(g/h));                    
                    break;
                case "":
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
        }
        
    }
    
}
