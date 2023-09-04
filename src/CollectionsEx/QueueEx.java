package CollectionsEx;

import java.util.PriorityQueue;

public class QueueEx 
{

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> Num = new  PriorityQueue<Integer>();
		
		Num.add(4);
		Num.add(2);
		Num.add(8);
		Num.add(6);
		Num.add(10);
		Num.add(1);
		Num.offer(11);
		

		
		System.out.println("Num Orginal Values: " + Num);
		System.out.println("emptyQue Head Values: " + Num.element());
		System.out.println("peek  Values: " + Num.peek());
		System.out.println("poll  Values: " + Num.poll());
		System.out.println("Num Orginal Values: " + Num);



		
		PriorityQueue<Integer> emptyQue = new  PriorityQueue<Integer>();
		//System.out.println("emptyQue Head Values: " + emptyQue.element());


	}

}
