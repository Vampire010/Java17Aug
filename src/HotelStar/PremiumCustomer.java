package HotelStar;

public class PremiumCustomer extends RegularCustomer
{
	@Override
	public void bill( double biillID , double billAmount   )
	{
		if(billAmount>=500)
		{
			double totalAmount = billAmount - 10;
			System.out.println("Premium Customer Bill " + totalAmount);
			
			double chashBack =  billAmount - totalAmount;
			System.out.println("Premium Customer Cashback " + chashBack);
		}
		else if(billAmount<500)
		{
			double totalAmount = billAmount - 10;
			System.out.println("Premium Customer Bill " + totalAmount);
			System.out.println("Premium Customer Cashback is Onle When "
					+ "totlaAmount is Grater than 500");

		}
	}
}
