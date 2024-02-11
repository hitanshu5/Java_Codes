import java.util.*;
class Ch2PE4
{
	public static void main(String parms[])
	{
		int i,j,n,k,l;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines ");
		n=sc.nextInt();
		for(i=1;k=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.println(" ");
			}
			for(j=1;l=k+i;j<=i;j++)
			{
				System.out.println((char)(l-- +'A'-1)+" ");
				k++;
			}
		}
		System.out.println();
		}
	}
}