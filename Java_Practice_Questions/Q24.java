// Given three strings S, S1, and S2 consisting of N, M, and K characters respectively, the
// task is to modify the string S by replacing all the substrings S1 with the string S2 in the
// string S. Hint:Use replace function.
package Java_Practice_Questions;

public class Q24 {
    public static void main(String[] args) {
        String str1 = "abababa";
        String str2 = "aba";
        String str3 = "Ansh";
        String newStr = str1.replace(str2, str3);
        System.out.println(newStr);
    }
    
}
