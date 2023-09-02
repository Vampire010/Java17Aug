package HotelStar;

public class Customer
{
	//States / Attributes
	String custID ;
	String CustName;
	String custAddress;
	long custConatct;
	public double  deliverCharge=5; 

	
	//Behaviour // Implentation // Functionality // Method
	public void displayCustomerDetails()
	{
		System.out.println("Customer ID: " + custID);
		System.out.println("Customer Name: " + CustName);
		System.out.println("Customer Address: " + custAddress);
		System.out.println("Customer Contact: " + custConatct);
	}
	
	
	public void updateDetails(long upcustConatct)
	{
		System.out.println("Customer Address: " + upcustConatct);
	}
	
	public void updateDetails(String upcustAddress )
	{
		System.out.println("Customer Contact: " + upcustAddress);
	}
	
	
	
	
	public void bill( double biillID , double billAmount   )
	{
		
			System.out.println("As of Now No Billing");	
	}

	

}
