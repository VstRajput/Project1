package Basic;

public class patternques {
    public static void main(String[] args) {
        int n = 3;
        for (int row = 0; row < 3 * n; row++)
        {
            if (row <= n) {
                for(int col = 0; col<1; col++){

                    System.out.print("@");
                }

            }

            if (row >= n && row<=(2*n)-1) {
                if(row>n){
                    for (int space=0;space<n;space++){
                        System.out.print(" ");
                    }
                }
                for (int star = 0; star < n; star++) {
                    System.out.print("*");
                }
            }
//
//                if (row == n) {
//                    for (int a = 0; a < 1; a++) {
//                        System.out.print("@");
//                    }
//                    for (int star = 0; star < n; star++) {
//                        System.out.print("*");
//                    }
//                }
//            if (row > n) {
//                for (int space = 0; space < n; space++) {
//                    System.out.print(" ");
//                }
//            }
//                if (row == (2 * n) - 1) {
//
//                    for (int star = 0; star < n; star++) {
//                        System.out.print("*");
//                    }
//                    for (int a = 0; a < 1; a++) {
//                        System.out.print("@");
//                    }
//
//                    if (row >= n * 2 - 1)
//                        System.out.print("@");
//                }
            System.out.println("");
            }
        }

    }



