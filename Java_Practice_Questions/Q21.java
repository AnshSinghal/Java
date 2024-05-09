// Manik wants to find out if a palindrome can be formed by permuting the letters of the
// string. Form example the letters of string “mamda” can be used to form palindrome
// “madam”. Write a program in java to help Manik to automate this process.
package Java_Practice_Questions;
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int[] arr = new int[26];
        for(char c : s1.toCharArray()){
            arr[c - 'a']++;
        }
        int odd = 0;
        for(int i : arr){
            if(i % 2 != 0){
                odd++;
            }
        }
        if(odd > 1){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
    
}
