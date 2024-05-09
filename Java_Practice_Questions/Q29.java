// Using the concept of classes and objects you are required to create a Java program in
// which a user reads a positive integer number and find the count of all digits.
package Java_Practice_Questions;

public class Q29 {
    public static void main(String[] args) {
        countIntegers c = new countIntegers();
        System.out.println(c.countInteger(123456));
    }        
}

class countIntegers{
    int count = 0;

    int countInteger(int num){
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
}
