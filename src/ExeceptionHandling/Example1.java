package ExeceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example1
{
	public void Hacked() throws FileNotFoundException
	{
		throw new FileNotFoundException("You are Hacked.....$$$$$$$$$$$");
	}

	public static void main(String[] args)throws FileNotFoundException , ArithmeticException , ArrayIndexOutOfBoundsException
	{
		
		//FileInputStream io = new FileInputStream("path");
		
		int[] evnNum = {2,4,6,8,10};
		
		
		try
		{
			System.out.println(evnNum[1]);
			
			System.out.println(10/2);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" ArrayIndexOutOfBoundsException Occured");
		}
		catch(ArithmeticException e)
		{
			System.out.println(  " ArithmeticException Occured");
		}
		
		finally
		{
			System.out.println(  " finally Occured");

		}
		
		System.out.println("My Further logic is Here");
		
		
		Example1 ex = new Example1();
		ex.Hacked();
		
		/*for(int i=0 ; i<=evnNum.length ; i++)
		{
			
		}*/
		
	}

}
