import java.util.*;
class Demo
{
	private int x;
	public Demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		x=sc.nextInt();
	}
	public String toString()
	{
		return("x="+x);
	}
}
class Main26
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		System.out.println(d1);
		Demo d2=new Demo();
		System.out.println(d2);
	}
}