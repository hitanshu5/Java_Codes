import java.util.*;
public class Exp1p2
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("The largest of the 3 is:"+a);
			}
			else
			{
				System.out.println("The largest of the 3 is:"+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("The largest of the 3 is:"+b);
			}
			else
			{
				System.out.println("The largest of the 3 is:"+c);
			}
		}
	}
}



