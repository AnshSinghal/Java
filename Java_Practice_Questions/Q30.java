// A circle is also defined by two of its properties, such as area and perimeter. The formulas
// for both the measures of the circle are given by; Area of a circle = πr. 2. The perimeter
// of a circle = 2πr. Use the classes concept in Java to calculate area and perimeter of circle
package Java_Practice_Questions;
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle(sc.nextInt());
        System.out.println("Area of the circle is: " + c.area());
        System.out.println("Circumference of the circle is: " + c.circumference());
    
    }
    
}

class Circle{
    double radius;

    Circle(double r){
        this.radius = r;
    }

    double area(){
        return Math.PI * radius * radius;
    }

    double circumference(){
        return 2 * Math.PI * radius;
    }
}
