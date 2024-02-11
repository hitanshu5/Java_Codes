import java.util.*;
class Cricket
{
	private int age,runs,wickets;
	private String name;
	private float avg;
	public Cricket()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Default Const\nEnter name, age, runs scored, wickets taken and batting average:");
		name=sc.nextLine();
		age=sc.nextInt();
		runs=sc.nextInt();
		wickets=sc.nextInt();
		avg=sc.nextFloat();
	}
	public Cricket(String n,int a,int r,int w,float av)
	{
		System.out.println("Param Const\n");
		name=n;
		age=a;
		runs=r;
		wickets=w;
		avg=av;
	}
	public Cricket(Cricket c)
	{
		System.out.println("Copy Const\n");
		name=c.name;
		age=c.age;
		runs=c.runs;
		wickets=c.wickets;
		avg=c.avg;
	}
	public void put()
	{
		System.out.println(age+"\t"+name+"\t"+runs+"\t"+wickets+"\t"+avg);
	}
}
class Exp6P2A
{
	public static void main(String args[])
	{
		int age,runs,wickets;
		float avg;
		String name;
		Cricket c=new Cricket();;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name, age, runs scored, wickets taken and batting average:");
		name=sc.nextLine();
		age=sc.nextInt();
		runs=sc.nextInt();
		wickets=sc.nextInt();
		avg=sc.nextFloat();
		Cricket c1=new Cricket(name,age,runs,wickets,avg);
		Cricket c2=new Cricket(c);
	}
}