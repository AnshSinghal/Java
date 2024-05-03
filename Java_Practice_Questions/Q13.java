// . Create a Java Program which will ask student two enter elements of two different
// matrices matrix_1, and matrix_2 such that matrix_1 and matrix_2 have same number of
// rows as well as same number of columns. Then program will output the elements of a
// third matrix matrix_3 such that matrix_3 has got the same dimensions as matrix_1 and
// matrix_2 and each element of matrix_3 will be sum of corresponding elements of matrix_1
// and matrix_2.

package Java_Practice_Questions;
import java.util.*;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the first matrix: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] matrix3 = new int[rows][columns];

        for(int i = 0; i<rows;i++){
            for(int j = 0;j<columns;j++){
                System.out.println("Enter the "+i+"th row and "+j+"th column element of the first matrix: ");
                matrix1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<rows;i++){
            for(int j = 0;j<columns;j++){
                System.out.println("Enter the "+i+"th row and "+j+"th column element of the second matrix: ");
                matrix2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The third matrix is: ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }



        
    }
    
}
