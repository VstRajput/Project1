package Basic;

public class patternquestion01 {
    public static void main(String[] args) {

        int n=4;

        for (int row = 0; row <= n; row++) {

            for (int col = 0; col < 1; col++) {
                System.out.print("@");
            }
            if (row == n) {

                for (int star = 0; star < n; star++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for (int row = 0; row < n-2; row++) {
            for (int space = 0; space < n; space++) {
                System.out.print(" ");
            }
                for (int star = 0; star < n; star++) {
                    System.out.print("*");
                }
            System.out.println("");
            }
        }
    }
