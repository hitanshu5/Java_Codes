import java.util.*;
class Multiply
{
	public static void main(String args[])
	{
		int i,j,k,m,n,p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of m n and p");
		m=sc.nextInt();
		n=sc.nextInt();
		p=sc.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[n][p];
		int c[][]=new int[m][p];
		System.out.println("MATRIX A");
		for(i=0;i<=m-1;i++)
		{
			for(i=0;i<=n-1;i++)
			{
				System.out.println("Enter a number ");
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<=n-1;i++)
		{
			for(i=0;i<=p-1;i++)
			{
				System.out.println("Enter a number ");
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<=m-1;i++)
		{
			for(i=0;i<=p-1;i++)
			{
				c[i][j]=0;
				for(i=0;i<=k-1;i++)
				{
					c[i][j]+=a[i][k]*[k][j];
				}
			}
		}
		System.out.println("Multiplication Matrix ");
		for(i=0;i<=m-1;i++)
		{
			for(i=0;i<=p-1;i++)
			{
				System.out.println(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
}			
