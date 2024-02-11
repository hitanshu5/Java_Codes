import java.util.*;
class Exp2_1
{
	public static void main(String args[])
	{
		int i,n,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println(" Enter array elements");
		for(i=0;i<n;i++)	
		{
		a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					continue;
				}
				else
				{
					b[i]=b[i]+a[j];
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	}
}	