import java.util.*;
class Cricket
{
	private int age,runs,wickets;
	private String name;
	private float avg;
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name, age, runs scored, wickets taken and batting average:");
		name=sc.nextLine();
		age=sc.nextInt();
		runs=sc.nextInt();
		wickets=sc.nextInt();
		avg=sc.nextFloat();
	}
	public void put()
	{
		System.out.println(age+"\t"+name+"\t"+runs+"\t"+wickets+"\t"+avg);
	}
}
class Exp5P5E
{
	public static void main(String args[])
	{
		Cricket c=new Cricket();
		c.get();
		c.put();
	}
}