package Day5;

public class Order 
{
	
	public void foodChoise(String foodName)
	{
		switch(foodName)
		{
		case "Pizza":
				System.out.println("You Orderd Pizza");
			  break;
				
		case "Sandwich":
			System.out.println("You Orderd Sandwich");
			break;
			
		case "Burger":
			System.out.println("You Orderd Burger");
			break;
			
		case "Juice":
			System.out.println("You Orderd Juice");
			break;
		default:
			System.out.println("Ordered Item Doesn't Exist");
			break;
			
		}
	}

	

}
