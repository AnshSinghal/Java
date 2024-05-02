// Create a Java Program which will ask user to enter Distance, time as String values , will
// generate corresponding double type values after using parse method and will print value
// of speed. Use parseDouble method of Double Wrapper Class in this program.

//ParseDouble is a static method of Double class that is used to get the primitive data type of a certain String. If we have a string and we want to get the double value of the string, then we use the parseDouble method. This method is available in java.lang package.
package Java_Practice_Questions;

public class Q4 {
    public static void main(String[] args) {
        String distance = "10.5";
        String time = "20.5";
        double distance1 = Double.parseDouble(distance);
        double time1 = Double.parseDouble(time);
        System.out.println(distance1);
        System.out.println(time1);
        System.out.println("Speed is: " + distance1/time1);
    }
}
