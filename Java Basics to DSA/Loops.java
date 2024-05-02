public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 1;

        while (i < 11) {
            System.out.println(i);
            i++;
        }

        i = 1;
        do { // this will run the statements inside atleat one time whether condition true or false
            System.out.println("Hello");
        } while (i == 2);



        for(; ;) {
            System.out.println("Apna College");
        }



        
    }

}
