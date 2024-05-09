// An Armstrong number is a number that is the sum of its digits each raised to the power
// of the number of digits. Your task to read a positive integer number and check whether
// the entered number is an Armstrong number or not.

package Java_Practice_Questions;

public class Q28 {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int digits = 0;
        while(num>0){;
            num /= 10;
            digits++;
        } 
        while(num>0){
            int digit = num%10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        if (num==sum){
            System.out.println("The number is an Armstrong number");
        }
        else{
            System.out.println("The number is not an Armstrong number");
        }
    }
    
}
