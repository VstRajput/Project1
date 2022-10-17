package Basic;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11,2,4,6};
        int ans = MaxRangle(arr,5,8);
        System.out.println(ans);
    }

     static int Max(int[] arr) {
        int max=arr[0];
         for (int i = 1; i < arr.length; i++) {
             if(arr[i] > max){
                 max=arr[i];
             }
         }return max;
    }

    static int MaxRangle(int[] arr , int start , int end) {
        int max=arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] > max){
                max=arr[i];
            }
        }return max;
    }
}
