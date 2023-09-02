package HotelStar;

public class Tester extends Sampletest {

	public static void main(String[] args) 
	{
		
		/*RegularCustomer regcust = new RegularCustomer();
		regcust.displayCustomerDetails();
		regcust.bill(null, 0, 0);
		
		PremiumCustomer prmcust = new PremiumCustomer();
		prmcust.displayCustomerDetails();
		prmcust.bill(null, 0, 0);
		
		
		GuestCustomer gstcust = new GuestCustomer();
		gstcust.displayCustomerDetails();
		gstcust.bill(null, 0, 0); */
		
		Tester tst = new Tester();
		tst.displayCustomerDetails(); 
		
		/*PremiumCustomer regcust = new PremiumCustomer();
		regcust.bill(101, 600); */
		
		
		
	}

	@Override
	public void displayCustomerDetails() {
		System.out.println("Im From Abstarct Class");
	}

}
