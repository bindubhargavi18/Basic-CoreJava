package basiccorejava;

import java.util.*;
public class SwapOfNumbers 
{
	public static void main(String[] args) {
		int number1,number2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number:");
		number1=s.nextInt();
		System.out.println("Enter Second number:");
		number2=s.nextInt();
		s.close();
		SwapOfNumbers sw=new SwapOfNumbers();
		sw.swap(number1,number2);
		
	}
	public void swap(int num1,int num2)
	{
		System.out.println("Numbers before swapping: "+num1+" "+num2);
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Numbers after swapping: "+num1+" "+num2);
	}
	

}
