package Basic;

import java.util.Arrays;

public class PassingInFunct {

    static void change(int[] arr){
        arr[2]=23;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
}
