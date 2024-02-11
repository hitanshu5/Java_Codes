import java.util.*;
class Pallindrome
{
	public static void main(String args[])
	{
		String str,rev="";
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		str=sc.nextLine();
		n=str.length();
		for(i=n-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
	}
}		
