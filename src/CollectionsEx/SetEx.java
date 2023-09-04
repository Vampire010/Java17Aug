package CollectionsEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {

		
		HashSet<Integer> evenNum = new  HashSet<Integer>();
		
		evenNum.add(4);
		evenNum.add(2);
		evenNum.add(8);
		evenNum.add(6);
		evenNum.add(10);

		//System.out.println("Even Orginal Values: " + evenNum);
		
	TreeSet<Integer> Num = new  TreeSet<Integer>();
		
	Num.add(4);
	Num.add(2);
	Num.add(8);
	Num.add(6);
	Num.add(10);
	Num.add(1);
	
	System.out.println("Num Orginal Values: " + Num);
	System.out.println("Num Descnding order Orginal Values: " + Num.descendingSet());
	System.out.println("pollFirst: " + Num.pollFirst());
	System.out.println("pollLast: " + Num.pollLast());
	
	System.out.println("headSet: " + Num.headSet(6));
	System.out.println("tailSet: " + Num.tailSet(6));
	
	}

}
