// The person needs some benefit from government for medical health insurance. Create a
// program in JAVA using following criteria,
// a. If age is >=18 and <=30, loan should have a coverage of 1 cr.
// b. If age lies between 31 to 60, he should get a coverage of 50 lacs.
// c. If the age is above sixty and less than 80, he should get coverage of 20 lacs.
// d. If age is above 80 or less than 18, No coverage will be provided.

package Java_Practice_Questions;
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your age: ");
       int age = sc.nextInt();
       if(age>=18 && age<=30){
           System.out.println("Loan coverage: 1 cr");
       }
       else if(age>=31 && age<=60){
           System.out.println("Loan coverage: 50 lacs");
       }
       else if(age>60 && age<80){
           System.out.println("Loan coverage: 20 lacs");
       }
       else{
           System.out.println("No coverage will be provided");
       }               
    }
}
