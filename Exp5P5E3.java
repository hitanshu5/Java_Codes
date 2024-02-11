import java.util.*;
class Cricket
{
	private int age,runs,wickets;
	private String name;
	private float avg;
	public Cricket()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name, age, runs scored, wickets taken and batting average:");
		name=sc.nextLine();
		age=sc.nextInt();
		runs=sc.nextInt();
		wickets=sc.nextInt();
		avg=sc.nextFloat();
	}
	public boolean greater(Cricket c)
	{
		if(avg<c.avg) return true;
		return false;
	}
	public void put()
	{
		System.out.println(age+"\t"+name+"\t"+runs+"\t"+wickets+"\t"+avg);
	}
}
class Exp5P5E3
{
	public static void main(String args[])
	{
		int i,n,j;
		Cricket temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players:");
		n=sc.nextInt();
		Cricket c[]=new Cricket[n];
		for(i=0;i<=n-1;i++)
		{
			c[i]=new Cricket();
		}
		for(i=0;i<=n-2;i++)
		{
			for(j=0;j<=n-2;j++)
			{
				if(c[j].greater(c[j+1]))
				{
					temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		System.out.println("Age\tName\tRuns\tWickets\tAverage");
		for(i=0;i<=n-1;i++)
		{
			c[i].put();
		}
	}
}