import java.util.*;
public class Exp1p6
{
	public static void main(String args[])
	{
		int n,i;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number n:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+(1/(Math.pow(i,2)));
		}
		System.out.println("Sum of the series="+sum);
	}
}



