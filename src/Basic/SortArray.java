package Basic;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = in.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int x;
                    x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
        for (int data : array) {
            System.out.print(data);
        }

    }
}
