import java.util.*;

public class if_else_switch_break {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not adult");
        }

        if (age == 18)
            System.out.println("HEllo"); // to run only one statement for if condition its not necessary to use
                                         // brackets. But only 1 condition will run after "if" statement

        // Switch
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Hello 1");
                break;
            case 2:
                System.out.println("Hello 2");
                break;
            case 3:
                System.out.println("Hello 3");
                break;
            default:
                System.out.println("Bye");

        }

    }

}