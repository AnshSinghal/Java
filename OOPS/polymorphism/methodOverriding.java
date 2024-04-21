package OOPS.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class methodOverriding { // Method Overriding is a feature that allows a subclass to provide a specific
                                // implementation of a method that is already provided by its parent class. When
                                // a method in a subclass has the same name, same parameters or signature, and
                                // same return type as a method in its super-class, then the method in the
                                // subclass is said to override the method in the super-class.
    public static void main(String[] args) {
        shapes obj = new square(); // Parent obj = new child();

        obj.area(); // here which method will be called depends on the child class object
        // this is called upcasting i.e. the reference variable of parent class is used
        // to refer to the child class object
        // this is also called as runtime polymorphism

        square obj2 = new square();
        obj2.area(); // here the method of child class will be called

        // Here upcasting is used to create a list of shapes
        List<shapes> shapeList = new ArrayList<>();
        shapeList.add(new square());
        shapeList.add(new Triangle());
        shapeList.add(new Circle());

        for (shapes currentShape : shapeList) {
            currentShape.area();  // Polymorphism in action!
        }

    }
}

class shapes {
    void area() {
        System.out.println("The formula for area is not defined for this shape");
    }
}

class square extends shapes {
    @Override // this is annotation and is not necessary to write but it is a good practice to
              // write it
    // it is used to check if the method is actually overriding the parent class
    // method
    void area() { // this is method overriding
        System.out.println("Area of square is side*side");
    }
}

class Triangle extends shapes {
    @Override
    void area() {
        System.out.println("Area of triangle is 0.5 * base * height");
    }
}

class Circle extends shapes {
    @Override
    void area() {
        System.out.println("Area of circle is pi * radius * radius");
    }
}
