package Basic;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer> data = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        data.add(10);
        data.add(20);
        data.add(30);
        System.out.println(data);
        data.set(1,15);
        System.out.println(data);
        data.remove(2);
        System.out.println(data);
        data.add(1,25);
        System.out.println(data);

        System.out.println(data.get(2));

    }
}
