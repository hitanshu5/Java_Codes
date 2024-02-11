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
	public Demo compare(Demo d)
	{
		if(d.x>x) return d;
		else return this;
	}
	public void display()
	{
		System.out.println("x="+x);
	}
}
class Main25
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=d1.compare(d2);
		d3.display();
	}
}