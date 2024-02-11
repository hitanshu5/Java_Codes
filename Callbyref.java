import java.util.*;
class Callbyref
{
	int n1,n2;
	static void swap(Callbyref c)
	{
		int temp;
		temp=c.n1;
		c.n1=c.n2;
		c.n2=temp;
		System.out.println("After swapping n1="+c.n1+"\nn2="+c.n2);
	}
	public static void main(String args[])
	{
		Callbyref c=new Callbyref();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ")
		c.n1=sc.nextInt();
		c.n2=sc.nextInt();
		System.out.println("Entered values are n1="+c.n1+"\nn2="+c.n2);
		swap(c);
		System.out.println("After returning to main n1="+c.n1+"\nn2="+c.n2);
	}
}