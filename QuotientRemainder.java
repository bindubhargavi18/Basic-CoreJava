package basiccorejava;

import java.util.Scanner;

public class QuotientRemainder 
{
	public static void main(String[] args) 
	{
		int dividend,divisor;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter dividend:");
		dividend=s.nextInt();
		System.out.println("Enter divisor:");
		divisor=s.nextInt();
		s.close();
		quotientAndRemainder(dividend,divisor);
	}
	static void quotientAndRemainder(int dividend,int divisor)
	{
		int quotient,remainder;
		quotient=dividend/divisor;
		remainder=dividend%divisor;
		System.out.println("Quotient: "+quotient +" Remainder: "+remainder);
	}

}
