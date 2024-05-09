// Concatenation is the process of joining two or more strings together to form a new string
// by appending the next string to the end of the previous strings. Rohan wans to concatenate
// two strings, however, if the concatenation creates a double-char, then omit one of the
// chars. For example, If the input strings are “Hellow” and “world” then the output should
// be “helloworld”.
package Java_Practice_Questions;
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.charAt(s1.length()-1) == s2.charAt(0)){
            System.out.println(s1 + s2.substring(1));
        } else {
            System.out.println(s1 + s2);
        }
    }
    
}
