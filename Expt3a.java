import java.util.*;
class Exp3p2
{
	public static void main(String args[])
	{
		String str; 
		Char ch;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		str=sc.nextLine();
		System.out.println("Enter a Character: ");
		ch=sc.nextChar();
		
		int index = 0;
		for(int i = 0; i<str.length();i++)
		{
			if(str.charAt(i) == ch)
				index++;
		}

		System.out.println("Character "+ch+ "occured "+index+ " times in "+str);
	}
}