package OOPS.polymorphism;

class sampleClass1{ //every class in java is a subclass of Object class
    int num;

    sampleClass1(int num){
        this.num = num;
    }
}

class sampleClass2{
    int num;

    sampleClass2(int num){
        this.num = num;
    }

    @Override
    public String toString() { //overriding the toString method of Object class
        return "sampleClass2{" +
                "num=" + num +
                '}';
    }
}

public class objectPrint {
    public static void main(String[] args) {
        sampleClass1 obj1 = new sampleClass1(10);
        sampleClass2 obj2 = new sampleClass2(20);

        System.out.println(obj1);
        System.out.println(obj2);
    }
    
}
