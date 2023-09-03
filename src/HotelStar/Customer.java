package HotelStar;

public class Customer
{
	//States / Attributes
	private String custID ;
	private String CustName;
	private String custAddress;
	private long custConatct;
	
	private double  deliverCharge=5; 

	public void setcustID(String newcustID)
	{
		custID = newcustID;
	}
	
	public String getcustID()
	{
		return custID;
	}
	
	
	
	
	
	/*public Customer()
	{
		System.out.println("Im a No Argument Constructor");
	} */
	
	/*public Customer(int a)
	{
		System.out.println("Im a  Argument Constructor");
	}
	
	public Customer(int a , int b)
	{
		System.out.println("Im a  Argument Constructor");
	} */
	
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
