package OOPS.polymorphism;

public class metrhodOverloading { // this takes place at the compile time

    void display(int a, int b) {
        System.out.println(a + " " + b);
    }

    void display(int a, int b, int c) {
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        metrhodOverloading obj = new metrhodOverloading();
        obj.display(1, 2);
        obj.display(1, 2, 3);
    }
    
}
