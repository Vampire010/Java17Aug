package Day5;

public class While {

	public static void main(String[] args) {
		
		int i =1;
		
		/*while(i<=10)
		{
			System.out.print(i + " ");
			i++;
		} */
		
		
		do{
			System.out.print(i + " ");
			

			if(i>=5)
			{
				break;
			}
			i++;

		}
		while(i<=10);
		
		
		
	}

}
