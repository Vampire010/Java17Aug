package Day4;

public class UnaryOperator {

	public static void main(String[] args) {
		
		double num1 = 12.5;
		
		double num2 = 3.5;
		//Pre Increment , Post Increment 
	
		double pstInc = num1++;
		System.out.println("Post Increment:" + pstInc);
		System.out.println("Post Increment:" + num1);

		double preInc = ++num2;
		System.out.println("pre Increment:" + preInc);

		
		//Pre decrement , Post decrement
		
		double num3 = 12.5;
		
		double num4 = 3.5;
		
		double pstDec = num3--;
		System.out.println("Post decrement:" + pstDec);
		System.out.println("Post decrement:" + num3);

		double preDec = --num4;
		System.out.println("pre decrement:" + preDec);
		
	}
}
