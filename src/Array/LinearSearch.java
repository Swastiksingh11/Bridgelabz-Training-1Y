package Array;
import java .util .*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter no");
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {

            if (arr[i] == target) {
                System.out.println(i);
            }

        }

    }

}