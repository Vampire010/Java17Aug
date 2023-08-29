package Day5;

public class PrintNum {

	public static void main(String[] args)
	{
		char alphabet ='A';
		char last = 'E';
		
		for(int i=1 ; i<=10 ; ++i) //i=1 B C rows = 6 . alpa = F	
		{
			for(int j =1 ; j<=i ; ++j)
			{
				System.out.print(alphabet + " ");
			}
			++alphabet;
			System.out.println();
		}
	

		
	}
}
/*
A
B B
C C C
D D D D
E E E E E

*/