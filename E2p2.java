import java.util.*;
class E2p2
{
	public static void main(String args[])
	{
		int n,i,j,large,t=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		n=sc.nextInt();
		int[][] a= new int[n][5];
		System.out.println("Enter roll number");
		for(i=0;i<n;i++)
		{
			a[i][0]=sc.nextInt();
		}
		System.out.println("Enter marks of 3 subjects");
		for(i=0;i<n;i++)
		{
			for(j=1;j<4;j++)
			{
				a[i][j]=sc.nextInt();
				a[i][4]=a[i][4]+a[i][j];
			}
			System.out.println("Next Student");
		}
		System.out.println("Roll no"+"\t"+"Sub1"+"\t"+"Sub2"+"\t"+"Sub3"+"\t"+"Total");
		for(i=0;i<n;i++)
		{
			for(j=0;j<=4;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		large=a[0][4];
		for(i=0;i<n;i++)
		{
			if(a[i][4]>large)
			{
				t=a[i][0];
			}
		}
		System.out.println("Topper is roll no ="+t);
	}	
}
