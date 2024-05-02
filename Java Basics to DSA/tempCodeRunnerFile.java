import java.util.Scanner;

class DigitCounter {
    public int countDigits(int number) {
        if (number <= 0) {
            return 0; // Handle non-positive input
        }

        int count = 0;
        while (number > 0) {
            number /= 10; // Remove the last digit
            count++;
        }
        return count;
    }
}

public class tempCodeRunnerFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer number: ");
        int number = scanner.nextInt();

        DigitCounter digitCounter = new DigitCounter();

        if (number > 0) {
            int totalDigits = digitCounter.countDigits(number);
            System.out.println("Total number of digits are: " + totalDigits);
        } else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }

        scanner.close();  // Close the scanner to avoid resource leaks
    }
}
