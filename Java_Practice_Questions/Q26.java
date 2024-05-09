// Create three arrays of same size n, the value of n should be taken from the user. In the
// first array the roll no of students should be stored followed by the second array where
// names are entered, and third array should contain the marks of the students. All the
// values in the arrays should be taken as input. Also, create a function to display the
// information of all the students.
// Input Format
// The first line represents the size of the array. The next three lines represent the name,
// Afterward, the next three lines represent the roll no and the next three lines represent the
// marks of the students
package Java_Practice_Questions;

public class Q26 {
    public static void main(String[] args) {
        int n = 5;
        int[] rno = {1,2,3,4,5};
        String[] names = {"Ansh", "Ankit", "Anshul", "Anshika", "Anshul"}; 
        int[] marks = {90, 80, 70, 60, 50};
        for(int i = 0; i < n; i++){
            System.out.print(names[i]+" ");
            System.out.print(rno[i]+ " ");
            System.out.print(marks[i]);
            System.out.println("");
        }
    }
    
}
