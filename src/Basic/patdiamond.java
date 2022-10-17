package Basic;

public class patdiamond {
    public static void main(String[] args) {
        PatternDiamond(5);
    }
    static void PatternDiamond(int n){
        for (int row = 1; row < (2*n); row++) {
            if (n > row) {

                for (int space = 1; space < (n - row) + 1; space++) {
                    System.out.print(" ");
                }

                for (int col = 1; col <= row; col++) {
                    System.out.print(" * ");
                }
            } else {
                for (int space = 1; space < (row - n) + 1; space++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= (2 * n) - row; col++) {
                    System.out.print(" * ");
                }
            }

                System.out.println();
        }

        }
    }
