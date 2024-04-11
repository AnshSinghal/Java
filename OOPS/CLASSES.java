package OOPS;

public class CLASSES {
    public static void main(String[] args) {
        Students student1 = new Students(); //Here student1 is an object of the class Students
        student1.name = "John"; //Here we are assigning the value to the attributes of the object
        student1.age = 20;
        student1.marks = 90.5f;


        Students student2 = new Students("Arjun",21,85.5f,"B"); //Here student2 is an object of the class Students
        student1.hello();
        student2.hello();
    }
        
}

class Students{ //Here Students is a class and it is a blueprint for creating objects
    String name;    //These are the attributes of the class
    int age;    //These can also be called as instance variables
    float marks;   //These are the properties of the class and can be accessed by the objects of the class
    String section = "A"; //This is a default value for the attribute "section".

    Students() { //This is a constructor of the class. It should have the same name as the class name
        System.out.println("Constructor called");
        this.name = "Ansh Singhal"; //Here "this" keyword is used to refer to the current object
        // it is used to refer to the current object and will assign the value of the parameter to the attribute of the object
        this.age = 18; //these are the default values for the attributes of the class
        this.marks = 99.5f;
        this.section = "G1";

        //this is how you call a constructor inside a constructor
        // this("Ansh", 18, 99.5f, "G1");

    }

    Students(String name, int age, float marks, String section) { //This is a parameterized constructor
        System.out.println("Parameterized constructor called");
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.section = section;
    }

    void hello() { //This is a method of the class
        System.out.println("Hi! My name is " + name);
    }

    void changeName(String newName){
        this.name = newName;
    }


}
