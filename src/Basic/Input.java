package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        //Taking Input from User
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {

            arr[i]=in.nextInt();
        }

//        for (int i = 0; i < arr.length; i++) {
//
//            System.out.print(arr[i]+" ");
//        }
        System.out.println(Arrays.toString(arr));

//        System.out.println(arr[3]);
    }
}
