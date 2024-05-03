// Create a Java program to compute and print section wise average marks of a college. The
// program will call a user defined method which will accept the following arguments: 1) A
// 2d array representing sections wise marks of students, the total number of sections, and
// total number of students in each section, and will return a 1-d array representing section
// wise average. Create this program using concepts of 2-d arrays, 1-d arrays and user
// defined methods.


package Java_Practice_Questions;

public class Q16 {
    static double[] Calculate_Section_Average(double[][] marks,int sections, int students){
        double[] sectionAvg = new double[sections];
        for(int i = 0; i<sections;i++){
            double sum = 0;
            for(int j = 0; j<students;j++){
                sum += marks[i][j];
            }
            double avg = sum/students;
            sectionAvg[i] = avg;
        }
        
        return sectionAvg;
    }
    public static void main(String[] args) {
        double[][] marks = {{10,20,30,40,50},{20,30,40,50,60},{30,40,50,60,70}};
        int sections = 3;
        int students = 5;
        double[] sectionAvg = Calculate_Section_Average(marks, sections, students);
        for(int i = 0; i<sections;i++){
            System.out.println("Section "+(i+1)+" Average: "+sectionAvg[i]);
        }
        
    }
    
}
