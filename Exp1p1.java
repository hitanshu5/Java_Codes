import java.util.Scanner;
class Exp1p1
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		if(n%2!=0)
		{
			System.out.println("weird");
		}
		else if(n%2==0 && n>2 && n<5)
		{
			System.out.println("not weird");
		}
		else if(n%2==0 && n>6 && n<20)
		{
			System.out.println("weird");
		}
		else if(n%2==0 && n>20)
		{
			System.out.println("not weird");
		}
	}
}


