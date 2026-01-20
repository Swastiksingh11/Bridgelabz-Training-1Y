import java.util.Scanner;

class FeetToYardsMiles {
    public static void main(String[] args) {

        double distanceInFeet;
        double yards;
        double miles;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();

        yards = distanceInFeet / 3;
        miles = yards / 1760;

        System.out.println("The distance in yards is " + yards +
                " while the distance in miles is " + miles);

        
    }
}
