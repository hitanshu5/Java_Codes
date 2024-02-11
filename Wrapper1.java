import java.util.*;
class Wrapper1
{
	public static void main(String args[])
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		x=sc.nextInt();
		Integer i=new Integer(x);
		y=i.intValue();
		System.out.println(i);
		System.out.println("y="+y);
	}
}