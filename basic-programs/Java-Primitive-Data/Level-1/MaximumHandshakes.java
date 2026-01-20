import java.util.Scanner;

class MaximumHandshakes {
    public static void main(String[] args) {

        int numberOfStudents;
        int handshakes;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        numberOfStudents = input.nextInt();

        handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of handshakes is " + handshakes);

        
    }
}
