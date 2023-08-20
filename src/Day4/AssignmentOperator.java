package Day4;

public class AssignmentOperator {

	public static void main(String[] args) 
	{
		
		
		double num1 = 12.5;
		
		double num2 = 3.5;
		
		//addition
		
		num1 +=  num2 ;
		System.out.println(num1);  //12.5 + 3.5 = 16

		
		num1 -=  num2 ;
		System.out.println(num1); // 16 - 3.5 = 12.5

		num1 *=  num2 ;
		System.out.println(num1); // 12.5 * 3.5 = 43.75

		
		num1 /=  num2 ;
		System.out.println(num1); // 43.75 / 3.5 = 12.5

		
		num1 %=  num2 ;
		System.out.println(num1); //125 % 3.5 = 2.0


		

	}

}
