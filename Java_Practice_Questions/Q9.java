// Mr Ramanujan is solving some mathematical problems and he realize that if the number
// is multiplied by itself then it becomes perfect square. He wants to know if the given
// positive number N is product of multiplying the number m by itself. Can you help
// Ramanujan to solve this problem?

package Java_Practice_Questions;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i*i==n){
                System.out.println("Yes, " + n + " is a perfect square of " + i);
                break;
            }
            else if(i*i>n){
                System.out.println("No, " + n + " is not a perfect square");
                break;
            }
        }

        Double d = Math.sqrt(n);
        if(d == Math.floor(d)){

            System.out.println("Yes, " + n + " is a perfect square of " + d.intValue());
        }
        else{
            System.out.println("No, " + n + " is not a perfect square");
        }
    }
    
}
