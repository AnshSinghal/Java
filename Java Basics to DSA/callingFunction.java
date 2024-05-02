public class callingFunction{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b); //Output: 10 20
        //The value of a and b is not changed because the value of a and b is passed to the function and not the address of a and b
        //This happens because in java the value of the variable is passed to the function and not the address of the variable
        //To change the value of a and b we need to pass the address of a and b to the function
        
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;   
    }
}