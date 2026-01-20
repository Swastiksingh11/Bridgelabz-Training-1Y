import java.util.Scanner;

class TriangleAreaConversion {
    public static void main(String[] args) {

        double baseCm, heightCm;
        double areaSqCm, areaSqIn;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        baseCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        heightCm = input.nextDouble();

        areaSqCm = 0.5 * baseCm * heightCm;
        areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaSqIn +
                " and sq cm is " + areaSqCm);

       
    }
}
