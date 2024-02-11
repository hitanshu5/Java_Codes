import java.util.*;
class Shape
{
	private float l,b,area;
	public Shape()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of square");
		l=sc.nextFloat();
		area=l*l;
		System.out.println("Area="+area);
	}
	public Shape(float length,float breadth)
	{
		l=length;
		b=breadth;
		area=length*breadth;
		System.out.println("Area="+area);
	}
	public Shape(Shape r)
	{
		l=r.l;
		b=r.b;
		area=l*b;
		System.out.println("Area="+area);		
	}
	
}
class Ex6p2
{
	public static void main(String args[])
	{
		float l,b;
		Scanner sc = new Scanner(System.in);
		Shape s = new Shape();
		System.out.println("Enter length and breadth");
		l=sc.nextFloat();
		b=sc.nextFloat();
		Shape r=new Shape(l,b);
		Shape c=new Shape(r);
	}
}	
