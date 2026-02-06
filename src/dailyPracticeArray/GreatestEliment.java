package dailyPracticeArray;
import java.util.Scanner;
public class GreatestEliment {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[]=new int [100];

        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
