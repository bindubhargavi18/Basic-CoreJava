package basiccorejava;
import java.util.*;
public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		int number;
		System.out.println("Enter number:");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		s.close();
		System.out.println(+number+"th harmonic number is:" +harmonicNumber(number));
		
	}
	static float harmonicNumber(int number)
	{
		float harmonic=1;
		for(int i=2;i<=number;i++)
		{
			harmonic+=(float)1/i;
		}
		return harmonic;

}
}
