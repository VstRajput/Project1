//package Basic;
//
//import java.util.Scanner;
//
//public class qqq2 {
//    static void zigZag(int[] arr) {
//
//        for (int i = 0; i < arr.length; i = i + 3) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//
//                if (arr[i] < arr[i + 2]) {
//                    int temp2 = arr[i + 1];
//                    arr[i + 1] = arr[i + 2];
//                    arr[i + 2] = temp2;
//                    System.out.print(arr[i] + " " + arr[i + 1] + " " + arr[i + 2]);
//                    System.out.println();
//                } else {
//                    System.out.println();
//                }
//                // code here
//            }
//
//            public static void main (String[]args){
//                Scanner in = new Scanner(System.in);
//                int[] arr = {4, 3, 7, 8, 6, 2, 1};
//                zigZag(arr);
//
//            }
//        }
//    }
//}
