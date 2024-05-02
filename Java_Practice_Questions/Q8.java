// The natural logarithm of a number is its logarithm to the base of the mathematical
// constant e. The natural logarithm of 2 is computed by adding up to n terms in the series:
// 1-1/2+1/3-1/4+1/5-...1/n where n is a positive integer and input by user. Can you write a
// Java program to compute natural logarithm of 2 up to n term. Use double for final sum.

package Java_Practice_Questions;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        double sum = 0;
        for(double i = 1; i<=n; i++){
            if(i%2==0){
                sum-=1/i;
            } else{
                sum+=1/i;
            }
        }   
        System.out.println("Natural logarithm of 2 up to " + n + " terms is: " + sum);  
    }
    
}
