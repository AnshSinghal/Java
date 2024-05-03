// . Create a Java Program for computing compound interest using while loop and printing
// the compound interest upto two positions after decimal.

package Java_Practice_Questions;

public class Q14 {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 0.01;
        double time = 10;
        // double compoundInterest = principal * Math.pow(1 + rate, time) - principal;
        // System.out.printf("The compound interest is %.2f", compoundInterest);
        // double compoundInterest = principal;
        // while(time>0){
        //     compoundInterest *= (1+rate);
        //     time--;
        // }
        // compoundInterest -= principal;
        // System.out.printf("The compound interest is %.2f\n", compoundInterest);
        double compoundInterest = principal * Math.pow((1+rate), time);
        System.out.printf("The compound interest is %.2f\n", compoundInterest-principal);
    }
}