package HotelStar;

public class Tester implements FinalBill {

	public static void main(String[] args) 
	{
		
		Customer regcust = new Customer();
		//regcust.
		regcust.setcustID("C101");
		
		System.out.println(regcust.getcustID());
		
		regcust.displayCustomerDetails();
		regcust.bill( 0, 0);
		
		/*PremiumCustomer prmcust = new PremiumCustomer();
		prmcust.displayCustomerDetails();
		prmcust.bill(null, 0, 0);
		
		
		GuestCustomer gstcust = new GuestCustomer();
		gstcust.displayCustomerDetails();
		gstcust.bill(null, 0, 0); */
		
		Tester tst = new Tester();
		tst.rewardPoints(); 
		
		/*PremiumCustomer regcust = new PremiumCustomer();
		regcust.bill(101, 600); */
		
		
		
	}

	/*@Override
	public void displayCustomerDetails() {
		System.out.println("Im From Abstarct Class");
	} */

	@Override
	public void rewardPoints()
	{
		System.out.println("Im From Interface");
		
	}

}
