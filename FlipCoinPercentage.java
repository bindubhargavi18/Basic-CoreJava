package basiccorejava;

import java.util.*;
public class FlipCoinPercentage 
{
	public static void main(String[] args) 
	{
		double headCount=0,tailCount=0,flips;
		double headPercentage,tailPercentage;
		System.out.println("Enter number of times coin to be flipped: ");
		Scanner s=new Scanner(System.in);
		flips=s.nextInt();
		s.close();		
		for(int i=1;i<=flips;i++)
		{
			double flip=Math.random();
			if (flip<0.5)
				headCount++;
			else
				tailCount++;
		}
		System.out.println("Head Count: "+headCount+ " Tail Count: "+tailCount);
		headPercentage=(headCount/(headCount+tailCount))*100;
		tailPercentage=(tailCount/(headCount+tailCount))*100;
		System.out.printf("Head percentage:%.2f,Tail Percentage:%.2f", headPercentage,tailPercentage);
		
	}

}
