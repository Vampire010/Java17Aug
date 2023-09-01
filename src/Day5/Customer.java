package Day5;

public class Customer
{
	//States / Attributes
	String custID ;
	String CustName;
	String custAddress;
	long custConatct;
	
	
	//Behaviour // Implentation // Functionality // Method
	public void displayCustomerDetails()
	{
		System.out.println("Customer ID: " + custID);
		System.out.println("Customer Name: " + CustName);
		System.out.println("Customer Address: " + custAddress);
		System.out.println("Customer Contact: " + custConatct);
	}

	

}
