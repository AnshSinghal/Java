// Create a Java Program for computation of scalar product of two vectors
package Java_Practice_Questions;
import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<Integer>();
        v1.addAll(Arrays.asList(1,2,3));
        Vector<Integer> v2 = new Vector<Integer>();
        v2.addAll(Arrays.asList(4,5,6));
        int scalarProduct = 0;
        for(int i=0; i<v1.size(); i++){
            scalarProduct += v1.get(i)*v2.get(i);
        }
        System.out.println("Scalar Product: "+scalarProduct);
    }
    
}
