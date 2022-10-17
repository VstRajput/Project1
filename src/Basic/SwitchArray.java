package Basic;

import java.util.Scanner;

public class SwitchArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int digit ;
        int sum=0;
        int i=0;
        int[] arr=new int[20];
        do {


                digit=sc.nextInt();
                arr[i]=digit;
                sum += arr[i];
                i++;
            }while(digit != 0);
        System.out.println("total sum="+sum);
        double avg = sum/i;
        System.out.println(arr.length);
        System.out.println("Average="+avg);

        }


    }
