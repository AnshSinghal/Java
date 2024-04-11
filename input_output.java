import java.util.*;

public class input_output {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String fullName = sc.nextLine();
        System.out.println(fullName);

        // The above code does not allow user to enter the value of fullName varibale
        // because When you call sc.nextLine() immediately after sc.next(), it reads the
        // remaining line, which includes the newline character left behind by sc.next()

        // To solve this...........
        name = sc.nextLine(); // we cannot write the data type again for a predefined local varibale
        fullName = sc.nextLine();
        System.out.print(name);
        System.out.print(fullName);

        name = int name;
    }
}