public class greatestCommonDivisor {
    public static int calculateGCD(int num1, int num2) {
        // Ensure numbers are non-negative 
        num1 = Math.abs(num1); 
        num2 = Math.abs(num2);
    
        // Handle the case where one number is zero directly
        if (num1 == 0) {
           return num2;
        } else if (num2 == 0) {
           return num1;
        }
    
        // Euclidean Algorithm:
        while (num1 != num2) {
            if (num1 > num2) {
                System.out.println("num1 "+num1);
                num1 = num1 - num2;
            } else {
                System.out.println("num2 "+num2);
                num2 = num2 - num1;
            }
        }
        return num1; 
    }
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        System.out.println(calculateGCD(num1, num2));
    }    
    
}
