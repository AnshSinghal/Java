package Java_Practice_Questions;
import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Length l1 = new Length();
        Length l2 = new Length();
        l1.getData();
        l2.getData();
        System.out.println("Sum of "+l1+" and "+l2+" is: "+l1.sum(l2));
        if(l1.equals(l2)){
            System.out.println(l1+" is eqaul to "+l2);
        }
        else{
            System.out.println(l1+" is not eqaul to "+l2);
        }
    }
}

class Length{
    int feets;
    int inches;

    public Length(){
    }

    public Length(int feets, int inches){
        this.feets = feets;
        this.inches = inches;
    }

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length in feets and inches: ");
        this.feets = sc.nextInt();
        this.inches = sc.nextInt();
    } 

    @Override // This is an annotation which tells the compiler that the following method is an overriden method
    public String toString() {
        return feets+"'"+inches+"''";
    }

    public Length sum(Length obj){
        int totalInches = this.inches+obj.inches;
        int totalFeets = this.feets+obj.feets+(totalInches/12);
        int remainingInches = totalInches%12;
        return new Length(totalFeets, remainingInches);
    }

    @Override
    public boolean equals(Object obj) {
        Length l = (Length)obj;
        return this.feets == l.feets && this.inches == l.inches;
    }
}
