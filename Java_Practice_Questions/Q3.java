// . [Boxing] Accept (int,float, , boolean) data values and convert them to relative Wrapper
// Classes and show output.

package Java_Practice_Questions;

public class Q3 {
    public static void main(String[] args) {
        int a = 10;
        float b = 20.5f;
        boolean c = true;
        Integer a1 = Integer.valueOf(a); // Boxing is the process of converting a primitive data type to a wrapper class object.
        Float b1 = Float.valueOf(b); 
        Boolean c1 = Boolean.valueOf(c);
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
    }
}
