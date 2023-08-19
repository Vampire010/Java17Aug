package Day3;

public class PersonIdentification 
{
	//Gloabl Variable
	Long Passport_Num = 9876543210123L;
	static Long DrvierLic = 321423637L;
	
	
	public static void universe()
	{
		System.out.println("###########################universe##############################" );

		PersonIdentification pIdentify = new PersonIdentification();

		System.out.println("Person is Identified by Passport Number: " + pIdentify.Passport_Num );
		
		System.out.println("Person is Identified by DrvierLic Number: " + DrvierLic  );

	}
	
	public void India()
	{
		//Local Variable
		long AadharNo = 123456789901L;
		System.out.println("########################India#################################" );

		System.out.println("Person is Identified by Aadhar Number: " + AadharNo  );
		System.out.println("Person is Identified by Passport Number: " + Passport_Num  );

	}
	
	public void Abroad()
	{
		// System.out.println("Person is Identified by Aadhar Number: " + AadharNo  );
		System.out.println("###########################Abroad##############################" );

		System.out.println("Person is Identified by Passport Number: " + Passport_Num );
		System.out.println("Person is Identified by DrvierLic Number: " + DrvierLic  );
		
	}
	
	public static void main(String[] args)
	{
		//object creation
		PersonIdentification pIdentify = new PersonIdentification();
		
		pIdentify.India();
		pIdentify.Abroad();
		
		universe();
		
	}

}
