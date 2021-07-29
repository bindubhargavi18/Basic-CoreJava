package basiccorejava;

import java.util.Scanner;

public class Power 
{
	public static void main(String[] args) {
	
		System.out.println("Enter power:");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		s.close();
		double power;
		for (int count=0;count<=number;count++)
		{
			power=Math.pow(2, count);
			System.out.println("2^"+count+ " is "+power);
		}
		
	}

}
