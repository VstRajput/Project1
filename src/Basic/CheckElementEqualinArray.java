package Basic;

public class CheckElementEqualinArray
{
    public static void main(String[] args)
    {
        long[] arr1={445,627,523,466,709,417,283,259,925,638,63,625,601,37,453,900,380,551,469,72,974,132,882,931,934,895,661,164,200,982,900,997,960,774,814,669,191};
        long[] arr2={709,900,469,37,283,417,259,132,974,814,551,466,982,627,63,669,934,625,661,960,601,380,523,200,900,191,895,774,72,997,638,931,445,925,453,16,4882};
        int n=37;
    boolean ans=check(arr1 , arr2 , n);
        System.out.println(ans);
    }

     static boolean check(long A[],long B[],int N)
    {
        int sp=0;
        for (long i = 0; i < N; i++) {
            for (long j = 0; j < N; j++) {
                if (A[Math.toIntExact(i)] == B[Math.toIntExact(j)]){
                    sp++;
                }
            }
        }
        if(sp == N){
            return true;
        }else return false;
    }
}
