package OOPS.Access;

class Object{
    public boolean equals(Object obj) {
        System.out.println("In Object equals");
        return (this != obj);
    }
    public void hello() {
        System.out.println("Hello");
    }
}

public class AccessModifiers extends Object{
    public int publicNum; // Accessible from anywhere
    int defaultNum; // Accessible within the package
    private int privateNum;     // Accessible only within the class
    protected int protectedNum; // Accessible within the package and outside the package through child class
    //This is the table [Access/java-access-modifiers-table-1.png]
    
    int num;
    String name;
    int[] age;
    public AccessModifiers(int num, String name, int[] age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }
    
    
}

class temp extends Object{
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers(34,"Ansh",new int[]{12,34,56});
        System.out.println(obj.publicNum);
        System.out.println(obj.defaultNum);
        // System.out.println(obj.privateNum); // Error
        System.out.println(obj.protectedNum);
        AccessModifiers obj2 = new AccessModifiers(34,"Ansh",new int[]{12,34,56});
        System.out.println(obj2.equals(obj));
    }
}
