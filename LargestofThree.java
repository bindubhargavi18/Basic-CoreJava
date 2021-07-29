package basiccorejava;

import java.util.*;
public class LargestofThree 
{
	public static void main(String[] args) 
	{
		int number1,number2,number3;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number: ");
		number1=s.nextInt();
		System.out.println("Enter second number: ");
		number2=s.nextInt();
		System.out.println("Enter third number: ");
		number3=s.nextInt();
		s.close();
		if (number1 > number2 && number1 > number3)
			System.out.println("Largest is: "+number1);
		else if(number2 > number1 && number2 > number3)
			System.out.println("Largest is: "+number2);
		else
			System.out.println("Largest is: "+number3);
	}

}
