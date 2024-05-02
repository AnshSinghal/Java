// Natural numbers are a part of the number system which includes all the positive integers
// from 1 till infinity and are also used for counting purpose. James wants to know the sum
// of first N natural numbers. Write a java program to help James. Use loop instead of
// formulae. Also check for negative numbers.
package Java_Practice_Questions;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Invalid Input");
        } else{
            int sum = 0;
            for(int i =0; i<=n; i++){
                sum += i;
            }System.out.println("Sum of first " + n + " natural numbers is: " + sum);   
        }
        
    }
    
}
