package Day2;

public class PersonDetails {

	public static void main(String[] args) 
	{
		//DataType VariableName = "Data";
		
		String p_Name = "John";
		char p$Lname = 'K';
		int pAge = 30;
		long pCnum = 9876543210L;
		double pheight = 5.8;
		Boolean pMarriedStatus = true;
		long $pIncomeinLakhs = 20;
		String _pFamily44 = "Yes";
		
		System.out.println("Person Name: " +p_Name + " " + p$Lname);
		System.out.println("Person Age: " +pAge);
		System.out.println("Person Contact Number: " +pCnum);
		System.out.println("Person Height: " +pheight);
		//System.out.println("Is person Married: " + !pMarriedStatus);
		System.out.println("Is person Married: " + pMarriedStatus);
	}

}
