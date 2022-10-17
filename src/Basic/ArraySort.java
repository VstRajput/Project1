package Basic;

public class ArraySort {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,21,34,67,98,101};
    int n=arr.length;
    ArrayNewSort(arr,n);
    }

    static void ArrayNewSort(int[] arr , int n) {

            int temp=arr[n-1];
            System.out.print(temp+" ");
             for (int i = 0; i < n-1; i++){
                 System.out.print(arr[i]+" ");
        }
    }

}
