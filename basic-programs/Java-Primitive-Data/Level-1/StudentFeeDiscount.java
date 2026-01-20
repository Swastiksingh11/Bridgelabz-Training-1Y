import java.util.Scanner;

class StudentFeeDiscount {
    public static void main(String[] args) {
        
        
        double fee, discountPercent, discount, finalFee;
        
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter student fee: ");
        fee = input.nextDouble();
        
        System.out.print("Enter discount percentage: ");
        discountPercent = input.nextDouble();
        
       
        discount = (fee * discountPercent) / 100;
       
        finalFee = fee - discount;
        
      
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
        
        
    }
}
