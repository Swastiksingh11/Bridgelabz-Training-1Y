import java.util.Scanner;

public class MaximumOfThree {

    public static int getInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    public static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = getInput(sc, "Enter first number: ");
        int num2 = getInput(sc, "Enter second number: ");
        int num3 = getInput(sc, "Enter third number: ");

        System.out.println("Maximum number is: " + findMaximum(num1, num2, num3));
        sc.close();
    }
}
