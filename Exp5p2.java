import java.util.*;
class Exp5P2
{
	static float area(float l,float b)
	{
		return(l*b);
	}
	static float area(float l)
	{
		return(l*l);
	}
	public static void main(String args[])
	{
		float l,b,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Square\n2.Rectangle\nEnter your choice:");
		choice=sc.nextInt();
		if(choice==2)
		{
			System.out.println("Enter length and breadth of rectangle:");
			l=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Area="+area(l,b));
		}
		else if(choice==1)
		{
			System.out.println("Enter length of square:");
			l=sc.nextInt();
			System.out.println("Area="+area(l));
		}
		else System.out.println("Invalid choice:");
	}
}