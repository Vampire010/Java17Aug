package HotelStar;

public class RegularCustomer extends Customer 
{
	@Override
	public void bill( double biillID , double billAmount   )
	{
			double totalAmount = billAmount - 5;
			System.out.println("Regular Customer Bill " + totalAmount);	
	}

	
}
