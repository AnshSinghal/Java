// Mr. Jack wants to find out the relationship between two strings. The two strings are said
// to be perfectly related to each other if both the strings have same characters and are of
// equal lengths, however, the order of the strings may be different. Can you help Mr. Jack
// to find out if the two given strings are perfectly related to each other or not with java
// program?

package Java_Practice_Questions;
import java.util.Arrays;

public class Q25 {
    public static void main(String[] args) {
        String str1 = "AnshSinghal";
        String str2 = "SinghalAnsh";
        str2 = str2.toLowerCase();
        str1 = str1.toLowerCase();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(char c : str1.toCharArray()){
            arr1[c-'a']++;
        }
        for(char c : str2.toCharArray()){
            arr2[c-'a']++;
        }
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
    
}
