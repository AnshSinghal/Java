// Create a Java Program which will ask student of a particular class to provide details about
// his or her grade. A Student can get only one the grades of the following grades 1,2 , and 3.
// In the end program will tell the total number of students which have got a particular
// grade.

package Java_Practice_Questions;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        System.out.println("Enter total number of students: ");
        int totalStudents = sc.nextInt();
        for(int i=0; i<totalStudents; i++){
            int grade = sc.nextInt();
            switch (grade) {
                case 1:
                    grade1++;
                    break;
                case 2:
                    grade2++;
                    break;
                case 3:
                    grade3++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Grade 1: "+grade1);
        System.out.println("Grade 2: "+grade2);
        System.out.println("Grade 3: "+grade3);
    }
}
