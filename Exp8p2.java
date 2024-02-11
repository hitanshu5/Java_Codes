import java.util.*;
class B
{
	final public void display() 
	{
		System.out.println("THIS IS CLASS B : ");
	}
}
class C extends B
{
	public void display()
	{
		System.out.println("THIS IS CLASS C :");
	}
}
class Exp8p2
{
	public static void main(String args[])
	{
		final int radius=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER RADIUS : ");
		radius=sc.nextInt();
		float area=3.14f*radius*radius;
		System.out.println("AREA IS : "+area);
		C obj=new C();
		obj.display();
	}
}
