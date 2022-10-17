package Basic;

import java.util.Arrays;

public class SwapIndex {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11,13};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            Swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void Swap(int[] arr, int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
