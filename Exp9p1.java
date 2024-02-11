import java.util.Scanner;
abstract class Shape 
{
	abstract double area();
}
class Circle extends Shape 
{
	private double radius;
	public Circle(double radius) 
	{
		this.radius = radius;
 	}
	public double area() 
	{
		return (Math.PI * radius * radius);
	}
}
class Triangle extends Shape 
{
	private double base;
	private double height;
	public Triangle(double base, double height) 
	{
		this.base = base;
		this.height = height;
	}
	public double area()
	{
		return 0.5 * base * height;
	}
}
class Rectangle extends Shape
{
	private double length;
	private double width;
	public Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}
	public double area()
	{
		return length * width;
	}
}
public class Exp9p1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
		Circle c = new Circle(sc.nextDouble());
		System.out.println("Area of Circle is: " + c.area());
		System.out.print("Enter the Base and Height of triangle: ");
		Triangle t = new Triangle(sc.nextDouble(), sc.nextDouble());
		System.out.println("Area of Triangle is: " + t.area());
		System.out.print("Enter the Width and Height of Rectangle: ");
		Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
		System.out.println("Area of Rectangle is: " + r.area());
		sc.close();
	}
}


