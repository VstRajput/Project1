package Basic;

public class qqq3 {
    public static void main(String[] args) {
        int[] arr = {2 ,3 ,1 ,1 ,2 ,4 ,2 ,0 ,1,1};
        int n = arr.length;
        int k =0;
        int c=0;
        while(k < n){
            int pointer=0;
            pointer = pointer+arr[k] ;
            k = pointer + k;
            c++;
        }
        System.out.println(c);
    }
}
