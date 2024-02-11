import java.util.*;
class CountObjects
{
	private static int count;
	public CountObjects()
	{
		count++;
	}
	public static void display()
	{
		System.out.println("Count="+count);
	}
	public void finalize()
	{
		System.out.println("In finalize method");
	}
	public String toString()
	{
		return("Hello");
	}
}
class Exp6P1
{
	public static void main(String args[])
	{
		CountObjects c1=new CountObjects();
		CountObjects.display();
		CountObjects c2=new CountObjects();
		CountObjects c3=new CountObjects();
		CountObjects c4=new CountObjects();
		CountObjects c5=new CountObjects();
		CountObjects.display();
		System.out.println(c5);
		c1=null;
		c2=null;
		System.gc();
	}
}