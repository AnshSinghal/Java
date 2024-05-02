import java.util.*;

public class fibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int a = 0;
        int b = 1;
        System.out.print(a + " "+b);
        for(int i = 0; i <= n; i++){
            sum = a + b;
            a =b;
            b= sum;
            System.out.print(" "+sum);

        }
        
    }
    
}
