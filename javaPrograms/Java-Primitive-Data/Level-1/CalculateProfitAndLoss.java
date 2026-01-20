class CalculateProfitAndLoss{
public static void main(String []args){
	int cost_price=129;
	int selling_price=191;
	double profit = selling_price-cost_price;
	double Profit_Percentage=profit/cost_price*100;
	System.out.print("The Cost Price is INR "+cost_price+" and Selling Price is INR "+selling_price+"\nThe Profit is INR "+profit+ " and the Profit Percentage is "+Profit_Percentage);
}
}