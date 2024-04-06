public class patterns {

    public static void main(String[] args) { // Solid Rectangle
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int m = 4;
        // int n = 5;
        // for (int i = 1; i <= m; i++) { // Hollow Ractangle
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 1 || j == 1 || i == m || j == n) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= 4; i++) {
        //     // System.out.println("*"*i); <-- This does ntow ork like this in java
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i = 4; i >= 1; i--) {
        //     // System.out.println("*"*i); <-- This does not work like this in java
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i = 4; i >= 1; i--) {
        //     // System.out.println("*"*i); <-- This does not work like this in java
        //     for (int j = 1; j <= 4; j++) {
        //         if (j >= i) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // for (int i = 5; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // int num =1;

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }


        // num =1;

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if((i+j)%2==0){
        //             System.out.print("1");
        //         } else System.err.print("0");
        //     }
        //     System.out.println();
        // }


        // for(int i = 5;i>=1;i--){
        //     for(int j =1;j<=i;j++){
        //         System.out.print(" ");
        //     }
        //     System.out.print("****");
        //     System.out.println();

        // }

        // n = 4;
        // for(int i =1;i<=n;i++){
        //     for(int j =1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j =1 ; j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j =1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

            

        // }

        // for(int i =n;i>=1;i--){
        //     for(int j =1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j =1 ; j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j =1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

            

        // }

        // for(int i = 1; i<=5;i++){
            
        // }
            // numbr pyramid
        // int n = 5;
        // for (int i=1; i<=n; i++){
        //     for(int j =1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        // Palindrome

        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }


    








    


    }

}
