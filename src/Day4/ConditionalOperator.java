package Day4;

public class ConditionalOperator {

	public static void main(String[] args) {
		double num1 = 13.5;
		
		double num2 = 13.5;
		
		double num3 = 13.5;

	
		String rslt = (num1==num2)&&(num2==num3)? "Condition Pass" : "Condition Failed";
		
		System.out.println(rslt);
	}

}