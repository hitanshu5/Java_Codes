import java.util.*;
class Practise
{
	static void swap(int a,int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping n1="+a+"\nn2="+b);
	}
	public static void  main(String args[])
	{
		int n1,n2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("Entered values are n1="+n1+"\nn2="+n2);
		swap(n1,n2);
		System.out.println("After returning to main n1="+n1+"\nn2="+n2);
	}
}	
		