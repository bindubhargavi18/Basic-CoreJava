package basiccorejava;

import java.util.*;
public class PrimeFactors 
{
	 public static void main(String args[])
	 {
	      int number;
	      Scanner s = new Scanner(System.in);
	      System.out.println("Enter a number:");
	      number = s.nextInt();
	      s.close();
	     primeFactors(number);
	 }
	 static void primeFactors(int number)
	 {
		 for (int i=2;i<=number;i++)
		 {
			 if(number%i==0)
		     {
		   	  	int prime=0;
				for (int j=2;j<=i/2;j++)
				{
					if(i%j==0)
						prime=1;
				} 
				if(prime==0)
					System.out.println(i);
		     }
		 }
     }
}
