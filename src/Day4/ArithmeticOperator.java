package Day4;

public class ArithmeticOperator {

	public static void main(String[] args) 
	{
		double num1 = 12.5;
		
		double num2 = 3.5;
		
		//addition
		
		double add = num1 + num2 ;
		
		double sub = num1 - num2 ;
		
		double mul = num1 * num2 ;
		
		double div = num1 / num2 ;
		
		double mod = num1 % num2 ;


		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);

		String start, middle, end, result;
		
		start = "Talk is cheap. ";
		middle = "Show me the code. ";
		end = "- Linus Torvalds";
		result = start + middle + end;
		System.out.println(result);
		
	}

}
