// Create a Java program to compute sqrt of sum of squares of permutation and
// combination of two input given numbers n and r. The program will call a user defined
// method for the purpose.
package Java_Practice_Questions;

import java.util.Scanner;

public class Q17 {
    
    static double sqrt(double n, double r){
        double sum = 0;
        //n!
        double nFact = 1;
        for (double i = n ; i >= 1 ; i--){
            nFact *= i;            
        }

        //(n-r)!
        double nrFact = 1;
        for(double i = (n-r); i>=1 ; i--){
            nrFact *= i;
        }

        //r!
        double rFact = 1;
        for(double i = r; i>=1 ; i--){
            rFact *= i;
        }  
        
        double combination = nFact/(nrFact*rFact);
        double permutation = nFact/(nrFact);

        sum = (combination*combination) + (permutation*permutation);
        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        double n = sc.nextDouble();
        System.out.println("Enter r: ");
        double r = sc.nextDouble();
        System.out.println("Sqrt of sum of squares of permutation and combination of "+n+" and "+r+" is: "+sqrt(n, r));
    }
}
