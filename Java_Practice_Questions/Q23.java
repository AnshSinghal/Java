// In Java, the StringBuffer class is used to create modifiable or mutable string objects. Two
// strings, word and separator, are provided to help you understand the concept of
// mutability in Java. Your task is to return a long string that included the number of
// occurrences of the word separated by the separator string. For example, if the inputs are
// "Hello","X" and 3 then the output is "HelloXHelloXHello".
package Java_Practice_Questions;
import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        StringBuffer s1 = new StringBuffer(str);
        int n = sc.nextInt();
        String sep = sc.next();
        for(int i = 0; i < n-1 ; i++){
            s1.append(sep);
            s1.append(str);
        }
        System.out.println(s1);
    }
    
}
