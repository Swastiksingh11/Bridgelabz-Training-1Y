import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            int factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial is " + factorial);
        } else {
            System.out.println("Enter a positive integer");
        }
    }
}
