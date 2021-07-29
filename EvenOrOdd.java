package LogicalProgramming;
import java.util.*;

public class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		int number;
		System.out.println("Enter Number: ");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		s.close();
		EvenOrOdd evenodd=new EvenOrOdd();
		boolean result=evenodd.evenOdd(number);
		if (result==true)
			System.out.println( +number+ " is Even Number");
		else
			System.out.println(+number+ " is Odd Number");
	}
	public boolean evenOdd(int num)
	{
		if(num%2==0)
			return true;
		else
			return false;		
	}

}
