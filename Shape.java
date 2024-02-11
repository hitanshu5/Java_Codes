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
	}
	public Shape Calculate()
	{
		area=l*b;
	}
	public Shape(Shape s)
	{
			
	}
	public void display()
	{
		System.out.println("Area="+area);
	}
class Ex6p2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Shape square = new Shape();
		Shape rectangle = new Shape(5,6);
		Shape s = new Shape();
		
		System.out.println("Area of square="+square.Display());
		System.out.println("Area of Rectangle="+rectangle.Display());
		System.out.println("Area of square="+copy.Display());
	}
}	
	

	
	
		