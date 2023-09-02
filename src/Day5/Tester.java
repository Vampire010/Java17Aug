package Day5;

public class Tester {

	public static void main(String[] args) 
	{
		
		Customer cust = new Customer();
		
		Order ord = new Order();
		
		Billing bills = new Billing();
		
		
		for(int i=2 ; i<3 ; i++)
		{
			if(i==1)
			{
			System.out.println("******HotelStar Copy*******");
		//	cust.displayCustomerDetails("C101", "John", "17th Street- Hill Town-1246763", 987654321L);
			System.out.println("**********************************************************");
			ord.foodChoise("Tea");
			System.out.println("**********************************************************");
			bills.bill("Regular Customer", 1234, 100);
			System.out.println("**********************************************************");
			}
			else if(i==2)
			{
				System.out.println("******Customer Copy");
				//cust.displayCustomerDetails("C101", "John", "17th Street- Hill Town-1246763", 987654321L);
				System.out.println("**********************************************************");
				ord.foodChoise("Tea");
				System.out.println("**********************************************************");
				bills.bill("Regular Customer", 1234, 100);
				System.out.println("**********************************************************");
			}
		}
		
	}

}
