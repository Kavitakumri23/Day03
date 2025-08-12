public class PATTERNPRINTING {
    public static void main(String[] args) {
        //Output
//        System.out.println("*");
//        System.out.print("**\n");
//        System.out.print("***\n");
//        System.out.print("****\n");
//        System.out.println("SECOND QUESTION\n");
//        System.out.println("*\n**");

//        int n=4;
//        int m = 5;

//        for (int i=1; i<=n; i++) {
//           for (int j=1; j<=m; j++){
//               System.out.print("*");
//           }
//            System.out.println();
//        }

        // PRINT HOLLOW RECTANGLE
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=m; j++){
//                if(i==1 || j ==1 || i ==n || j == m){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//    }


        // PRINT HALF PYRAMID
//        int n=4;
//        for (int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println( );
//        }

//        // PRINT INVERTED HALF PYRAMID
//        int n=4;
//        for (int i=n; i>=1; i--) {
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println( );
//        }

        // PRINT INVERTED HALF PYRAMID ROTATED BY 180 DEGREE
//        int n = 4;
//        for(int i=1; i<=n; i++) {
//            //INNER LOOP
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            //inner loop -> star point
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Half PYRAMID WITH NUMBERS
//        int n=4;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // INVERTED HALF PYRAMID NUMBERS
//        int n=5;
//        // outer loop
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i+1; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // FLOYD'S TRIANGLE
//        int n =5;
//        int number =1;
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++){
//                System.out.print(number +" ");
//                number++;
//            }
//            System.out.println( );
//        }

        // 0 & 1 TRIANGLE
//        int n=5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                int sum = i+j;
//                if(sum %2 == 0) {
//                    System.out.print("1 ");
//                } else {
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }

        // BUTTERFLY QUESTION
//        int n= 5;
//        //  upper half
//        for(int i=1; i<=n; i++){
//            for(int j =1; j<=i; j++){
//                System.out.print("*");
//            }
//
//            // spaces
//            int space = 2*(n-i);
//            for(int j=1; j<=space; j++){
//                System.out.print(" ");
//            }
//
//            // 2nd part
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // lower half
//        for(int i=n; i>=1; i--){
//            for(int j =1; j<=i; j++){
//                System.out.print("*");
//            }
//
//            // spaces
//            int space = 2*(n-i);
//            for(int j=1; j<=space; j++){
//                System.out.print(" ");
//            }
//
//            // 2nd part
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // SOLID Rhombus
//          *****
//         *****
//        *****
//       *****
//      *****

//        int n= 5;
//        for(int i=1; i<=n; i++){
//            //spaces
//            int spaces = n-i;
//            for(int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//
//            //stars
//            for(int k=1; k<=5; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//     }

        // NUMBER PYRAMID
//        int n = 5;
//        for(int i=1; i<=n; i++){
//            //spaces
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//
//            //stars -> PRINT ROW NUMBER TIMES, row number times
//           1
//          2 2
//         3 3 3
//        4 4 4 4
//       5 5 5 5 5
//
//            for(int k=1; k<=i; k++){
//                System.out.print(i + " ");
//            }
//
//            System.out.println();
//        }


        //PALINDROMIC PATTERN
//        1
//       212
//      32123
//     4321234
//    543212345

//        int n =5;
//        for(int i=1; i<=n; i++){
//            //spaces
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//
//            //first half numbers
//            for(int j=i; j>=1; j--){
//                System.out.print(j);
//            }
//
//            //second half numbers
//            for(int j=2; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // DIAMOND PATTERN
//         *
//        ***
//       *****
//      *******
//      *******
//       *****
//        ***
//         *

        int n =4;

        //UPPER HALF
        for(int i=1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //LOWER HALF
        for(int i=n; i>=1; i--){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
