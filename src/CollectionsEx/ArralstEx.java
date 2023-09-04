package CollectionsEx;

import java.util.*;

public class ArralstEx 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> evenNum = new  ArrayList<Integer>();
		evenNum.add(2);
		evenNum.add(4);
		evenNum.add(6);
		evenNum.add(8);
		evenNum.add(2);

		System.out.println("Even Orginal Values: " + evenNum);

		System.out.println(evenNum.get(1));
		evenNum.set(2, 10);
		System.out.println("updated Values: " +evenNum);
		
		ArrayList<Integer> oddNum = new  ArrayList<Integer>();
		oddNum.add(1);
		oddNum.add(3);
		oddNum.add(5);
		oddNum.add(7);
		System.out.println("Odd Orginal Values: " + oddNum);
		
		
		ArrayList<Integer> AllNum = new  ArrayList<Integer>();
		AllNum.addAll(evenNum);
		AllNum.addAll(oddNum);

		System.out.println("AllNum Orginal Values: " + AllNum);
		
		AllNum.remove(3);

		System.out.println("After Remove Orginal Values: " + AllNum);

		
		AllNum.removeAll(oddNum);

		System.out.println("After Remove All Orginal Values: " + AllNum);

	}

}
