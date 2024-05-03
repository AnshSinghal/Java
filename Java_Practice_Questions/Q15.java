// Create a Java Program that will call a user defined method Caculate_Compund_Interest.
// The method will take following arguments: an array representing Principal invested by
// different account holders, an array representing various Rate_of_Interest values
// applicable on different account holders, and an array representing various Time Periods
// for which different account holders have invested their money and will return an array
// representing different compound interest values received by different account holders:

package Java_Practice_Questions;
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of account holders: ");
        int n = sc.nextInt();
        double[] principal = new double[n];
        double[] rate = new double[n];
        double[] time = new double[n];
        double[] compoundInterest = new double[n];
        System.out.println("Enter the principal amount for each account holder: ");
        for(int i = 0;i<n;i++){
            principal[i] = sc.nextDouble();
        }
        System.out.println("Enter the rate of interest for each account holder: ");
        for(int i = 0;i<n;i++){
            rate[i] = sc.nextDouble()/100;
        }
        System.out.println("Enter the time period for each account holder: ");
        for(int i = 0;i<n;i++){
            time[i] = sc.nextDouble();
        }
        compoundInterest = Calculate_Compound_Interest(principal, rate, time);
        System.out.println("The compound interest for each account holder is: ");
        System.out.println(Arrays.toString(compoundInterest));
    }

    public static double[] Calculate_Compound_Interest(double[] principal, double[] rate, double[] time){
        double[] compoundInterest = new double[principal.length];
        for(int i = 0;i<principal.length;i++){
            System.out.println(principal[i] * Math.pow((1+rate[i]), time[i]));
            compoundInterest[i] = (principal[i] * Math.pow((1+rate[i]), time[i]))-principal[i];
        }
        return compoundInterest;
    }
    
}
