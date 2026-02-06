
import java .util.Scanner;

public class TransArray {
    public static void main (String args []){
        Scanner sc =new Scanner (System.in);
        int arr[]=new int [100];
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

    public static class sumofarray {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int arr[]=new int[100];
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int sum=0;
            for(int i=0;i<n;i++){
                sum=sum+arr[i];
                System.out.println(sum);
            }

        }
    }
}
