package Day5;

public class Billing {

	public double  deliverCharge=5; 
	public void bill(String custType, double biillID , double billAmount   )
	{
		if(custType=="Regular Customer") 
		{
			double totalAmount = billAmount - 5;
			System.out.println("Regular Customer Bill " + totalAmount);
			
		}
		else if(custType=="Premium Customer")
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
			else
			{
				System.out.println("Invalid Amount Entred");
			}
			
		}
		else if(custType=="Guest Customer")
		{
			double totalAmount = billAmount + deliverCharge;
			System.out.println("Guest Customer Bill: "+ totalAmount);
		}
		else
		{
			System.out.println("Invalid Customer Type");
		}
		
		
		
		
		
		
		
		
	}

}
