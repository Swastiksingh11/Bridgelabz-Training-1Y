import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {

        double base, height;
        double areaInInches, areaInCm;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
        base = input.nextDouble();

        System.out.print("Enter height in inches: ");
        height = input.nextDouble();

        areaInInches = 0.5 * base * height;
        areaInCm = areaInInches * 6.4516;

        System.out.println("The area of the triangle is " + areaInInches +
                " square inches and " + areaInCm + " square centimeters");

        input.close();
    }
}
