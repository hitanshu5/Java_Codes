import java.util.*;
class Cricket
{
	private String name;
	private int a,w,r;
	private float avg;
	public void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cricketers name,age,runs,wickets and average");
		name=sc.nextLine();
		a=sc.nextInt();
		r=sc.nextInt();
		w=sc.nextInt();
		avg=sc.nextFloat();
	}
	public void put()
	{
		System.out.println(name+"\t"+a+"\t"+r+"\t"+w+"\t"+avg);
	}
}
class Prac
{
	public static void main(String args[])
	{
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of cricketers");
		n=sc.nextInt();
		sc.nextLine();
		Cricket c[]=new Cricket[n];
		for(i=0;i<n;i++)
		{
			c[i]=new Cricket();
			c[i].get();
		}
		for(i=0;i<n;i++)
		{
			c[i].put();
		}
	}
}
