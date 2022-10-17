package Basic;


public class qqq {


    public static int equilibriumPoint(int n, long[] arr) {
        long sum = 0;
        for (int i = 0; i < n; i++) {

            sum = sum + arr[i];
        }

            long left=0;
            long right;
            int i=0;
           do {

               left += arr[i];
               right = sum-left;
               i++;
               if (left > right) {
                   int leftsum=0;
                   int rightsum=0;
                   for (int j = 0; j < i-1; j++) {
                       leftsum += arr[j];
                   }
                   for (int j = n-1; j > i-1; j--) {
                       rightsum += arr[j];
                   }
                   if (rightsum == leftsum) {
                       return (int) arr[i-1];
                   }
               }
                }while (i<n);
           return -1;
            }

    public static void main(String[] args) {

        long[] arr = {20,17,42,25,32,32,30,32,37,9,2,33,31,17,14,40,9,12,36,21,8,33,6,6,10,37,12,26,21,3};
        int n=arr.length;
        int ans = equilibriumPoint(n, arr);
        System.out.println(ans);
    }
}