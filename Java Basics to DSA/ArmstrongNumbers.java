import java.util.*;
public class ArmstrongNumbers {
    // Armstrong number is a number that is equal to the sum of cubes of its digits

    static boolean isArmstrong(int n){
        int sum = 0;
        int temp = n;
        while (n>0){ 
            int rem = n%10;
            sum+=rem*rem*rem;
            n = n/10;
        }
        return sum==temp;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));

        // Lets print all 3 digit Armstrong numbers
        for(int i = 100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
}
