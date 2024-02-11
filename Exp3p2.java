import java.util.*;
class Exp3p3
{
	public static void main(String args[])
	{
		String str,str1; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		str=sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		str1=sb.toString();
		if(str.compareToIsgnoreCase(str1))
		System.out.print("Pallindrome");
		else
		System.out.print("not a Pallindrome");
	}
}
		