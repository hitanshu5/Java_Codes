import java.util.*;
public class Exp1p7b
{
	public static void main(String args[])
	{
		int i,j,k,l,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		n=sc.nextInt();
		for(i=1,k=1;i<=n;i++)
		{
			for(j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(j=1,l=k+i-1;j<=i;j++)
			{
				System.out.print((char)(l--+'A'-1));
				k++;
			}
			System.out.print("\n");
		}
	}
}



