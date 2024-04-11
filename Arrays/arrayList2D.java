import java.util.*;


public class arrayList2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Syntax to declare a 2D array without a fixed size:
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initializing the 2D ArrayList
        for(int i = 0; i < 3; i++){ // 3 rows
            list.add(new ArrayList<Integer>());
        }

        //Adding elements to the 2D ArrayList
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(sc.nextInt()); // Adding elements to the ith row
            }
        }
        
        //Printing the 2D ArrayList
        System.out.print(list);
    }    
}
