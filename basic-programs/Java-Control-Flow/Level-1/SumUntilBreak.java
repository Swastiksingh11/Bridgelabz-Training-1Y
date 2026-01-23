import java.util.Scanner;

class SumUntilBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.print("Enter number: ");
            double number = input.nextDouble();

            if (number <= 0)
                break;

            total += number;
        }

        System.out.println("Total sum is " + total);
    }
}
