package Day5;

public class Tester {

	public static void main(String[] args) 
	{
		
		Customer cust = new Customer();
		cust.displayCustomerDetails("C101", "John", "17th Street- Hill Town-1246763", 987654321L);
		
		Billing bills = new Billing();
		bills.bill("Regular Customer", 1234, 100);
		bills.bill("Premium Customer", 1234, 199);
		bills.bill("Guest Customer", 1234, 485);
		bills.bill("Regularded Customer", 1234, 100);
	}

}
