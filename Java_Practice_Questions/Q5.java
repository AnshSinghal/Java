// Create a Java Program which will ask user to enter voltage, resistance, and will print
// value of current. Develop this program using double wrapper class.

package Java_Practice_Questions;

public class Q5 {
    public static void main(String[] args) {
        double voltage = 10.5;
        double resistance = 20.5;
        Double voltage1 = Double.valueOf(voltage);
        Double resistance1 = Double.valueOf(resistance);
        System.out.println("Current is: " + voltage1/resistance1);
    }
}
