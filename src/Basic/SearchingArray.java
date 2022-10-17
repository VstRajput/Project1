package Basic;

import java.util.Scanner;

public class SearchingArray {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter total id");
        int size=in.nextInt();
        int[] arr= new int[size];

        for (int i = 0; i < size; i++) {
            arr[i]= in.nextInt();
        }
        System.out.println("Please enter your id");
        int id=in.nextInt();
        boolean flag=false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == id) {
                flag=true;

            }
        }if (flag){
            System.out.println("Id Found");
        }else System.out.println("Id not found");
    }
}
