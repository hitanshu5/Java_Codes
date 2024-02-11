import java.util.*;
class Pattern
{
	public static void main(String args[])
	{
		int i,j,n=5,c;
		if(n%2==0) c=n/2;
		else c=n/2+1;
		for(i=1;i<=c;i++)
		{
			for(j=1;j<=c-i;j++)
			{
				System.out.print(" ");
			}
			for(j=c;j>=c+1-i;j--)
			{
				System.out.print(j);
			}	
			for(j=c+2-i;j<=c;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(i=c-1;i>=1;i--)
		{
			for(j=1;j<=c-i;j++)
			{
				System.out.print(" ");
			}
			for(j=c;j>=c+1-i;j--)
			{
				System.out.print(j);
			}	
			for(j=c+2-i;j<=c;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}