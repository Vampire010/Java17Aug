package Day5;

public class Resturent 
{
	public String restName = "HotelStar";
	public String restAddress ="#24 , 6th main Road , Temple Town";
	
	//static long[] restCNo = new long[3];
	
	long[] restCNo = {9876543210L,9876512340L ,9876512350L };
	
	


	
	
	public void DisplayResturentDetails(  )
	{
		System.out.println("Rest Name: " + restName);
		System.out.println("Rest Address: " + restAddress);
		
		
		/*System.out.println("Rest Contact1: " + restCNo[0]);
		System.out.println("Rest Contact2: " + restCNo[1]);
		System.out.println("Rest Contact3: " + restCNo[2]); */
		
		/* for(int i=0 ; i<restCNo.length;i++ )
		{
			System.out.println("Rest Contact" + i + " : " + restCNo[i]);
		} */
		
		for(long rcno: restCNo)
		{
			System.out.println("Rest Contact: " + rcno);
		}
		
		
		
	}

	public static void main(String[] args) 
	{
		
		/*restCNo[0]=9876543210L;
		restCNo[1]=9876512340L;
		restCNo[2]=9876512350L; */
		
		Resturent rest = new Resturent();
		rest.DisplayResturentDetails();

	}

}
