// A list of n student’s records is given to a clerk for removing the duplicates records.
// However, he did not want to add or delete a particular record; hence, he decided to create
// a new record list, where he keep only one copy of a particular records. Write a java
// program that assist him in this task. [Note: Data should be in sorted order]

package Java_Practice_Questions;
import java.util.Arrays;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int[] finalArray = removeDumplicates(arr, n);
        System.out.println(Arrays.toString(finalArray));
    }

    static int[] removeDumplicates(int[] arr, int n){
        Arrays.sort(arr);
        // getting the number of unique record
        int uniqueRecords = 1;
        for(int i = 1 ; i < n; i++){
            if(arr[i] != arr[i-1]){
                uniqueRecords++;
            }
        }
        // creating a new array with unique records
        int[] uniqueArray = new int[uniqueRecords];
        uniqueArray[0] = arr[0]; // first element is always unique
        int index = 1;
        for(int i = 1 ; i < n; i++){
            if(arr[i] != arr[i-1]){
                uniqueArray[index++] = arr[i];
            }
        }
        return uniqueArray;
    }
}
