import java.util.*;
class Ch3PEX
{
	public static void main(String args[])
	{
		int i,j,m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		m=sc.nextInt();
		int a[][]=new int[m][];
		for(i=0;i<=m-1;i++)
		{
			a[i]=new int[i+1];
			for(j=0;j<=i;j++)
			{
				a[i][j]=j+1;
			}
		}
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();	
		}
	}
}