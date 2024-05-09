// Create a Java Program which will call a method cos_length_Arrayfinder which will take
// following inputs: a 1-d array of String type and size of array and will return a I-d array
// of type double length_sin_array such that each element of length_cos_sin_array will hold
// the addition of cos of, and sin of length of corresponding element of 1-d string array passed
// as argument

package Java_Practice_Questions;
import java.util.Scanner;

public class Q19 {
    static double[] cos_length_Arrayfinder(String[] arr, int size){
        double[] finalArray = new double[size];
        for(int i =0;i<size;i++){
            finalArray[i] = Math.cos(arr[i].length())+Math.sin(arr[i].length());
        }
        return finalArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<size;i++){
            arr[i] = sc.next();
        }
        double[] finalArray = cos_length_Arrayfinder(arr,size);
        System.out.println("The cosine of the length of each element of the array is: ");
        for(int i = 0;i<size;i++){
            System.out.println(finalArray[i]);
        }

        
    }
    
}
