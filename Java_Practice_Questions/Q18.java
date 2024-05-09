// Create a Java Program which will do special addition sin and cosine of two input numbers
// n and r and will return result where result is described below.
// Result=sqrt(sin(n)cos(r)sin(n)cos(r)+sin(r)cos(n)sin(r)cos(n))
package Java_Practice_Questions;

import java.util.Scanner;

public class Q18 {

    static double spadd(double n, double r){
        // n = Math.toRadians(n);
        // r = Math.toRadians(r);
        // return Math.sqrt(Math.sin(n)*Math.cos(r)*Math.sin(n)*Math.cos(r) + Math.sin(r)*Math.cos(n)*Math.sin(r)*Math.cos(n));
        double nRadians = Math.toRadians(n);
        double rRadians = Math.toRadians(r);

        double part1 = Math.sin(nRadians) * Math.cos(rRadians) * Math.sin(nRadians) * Math.cos(rRadians); 
        double part2 = Math.sin(rRadians) * Math.cos(nRadians) * Math.sin(rRadians) * Math.cos(nRadians);

        double result = Math.sqrt(part1 + part2);
        return result;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        double n = sc.nextDouble();
        System.out.println("Enter r: ");
        double r = sc.nextDouble();
        System.out.println(spadd(n,r));
        
    }
}
