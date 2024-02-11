import java.util.*;
public class Exp2p2
{
	public static void main(String args[])
	{
		int a[][]=new int[6][6];
		int i,n,j,sum,top=0,large;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the Roll number and marks in maths, science and english in that order:");
			for(j=0;j<4;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Rollno\t\tMath\t\tScience\t\tEnglish\t\tTotal");
		for(i=0;i<n;i++)
		{
			sum=0;
			for(j=0;j<4;j++)
			{
				System.out.print(a[i][j]+"\t\t");
			}
			for(j=1;j<4;j++)
			{
				sum=sum+a[i][j];
			}
			a[i][5]=sum;
			System.out.print(sum+"\t\t");
			System.out.print("\n");
		}
		large=a[0][5];
		top=a[0][0];
		for(i=1;i<n;i++)
		{
			if(a[i][5]>large)
			{
				large=a[i][5];
				top=a[i][0];
			}
		}
		System.out.println("Topper is roll no:"+top+"\nWith marks total of "+large);
	}
}
