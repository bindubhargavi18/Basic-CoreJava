package basiccorejava;
import java.util.*;
public class VowelorConsonant 
{
	public static void main(String[] args) 
	{
		boolean vowel=false;;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter alphabet : ");
		char alphabet=s.next().charAt(0); 
		s.close();
		switch(alphabet)
		{
		   case 'a' :
		   case 'e' :
	       case 'i' :
		   case 'o' :
		   case 'u' :
		   case 'A' :
		   case 'E' :
		   case 'I' :
		   case 'O' :
		   case 'U' : vowel = true;
		}
		if(vowel == true) 
		   System.out.println(alphabet+" is  a Vowel");
		else 
		{
		   if((alphabet>='a' && alphabet<='z')||(alphabet>='A'&& alphabet<='Z'))
			System.out.println(alphabet+" is a Consonant");
		   else
			System.out.println("Given " +alphabet+" is not an alphabet");		
	     }
	}
}