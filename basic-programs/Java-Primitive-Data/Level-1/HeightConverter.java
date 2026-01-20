import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {

        double cm;
        int feet;
        double inches;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        cm = input.nextDouble();

        inches = cm / 2.54;
        feet = (int)(inches / 12);
        inches = inches % 12;

        System.out.println("Your Height in cm is " + cm +
                " while in feet is " + feet +
                " and inches is " + inches);

       
    }
}
