import java.util.*;
class Student
{
	private int id,p,c,m,total;
	private String name;
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name, ID and marks in 3 subjects:");
		name=sc.nextLine();
		id=sc.nextInt();
		p=sc.nextInt();
		c=sc.nextInt();
		m=sc.nextInt();
		total=p+c+m;
	}
	public boolean greater(Student s)
	{
		if(total<s.total) return true;
		return false;
	}
	public void put()
	{
		System.out.println(id+"\t"+name+"\t"+p+"\t"+c+"\t"+m+"\t"+total);
	}
}
class Exp5P5
{
	public static void main(String args[])
	{
		int n,i,j;
		Student temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		n=sc.nextInt();
		Student s[]=new Student[n];
		for(i=0;i<=n-1;i++)
		{
			s[i]=new Student();
			s[i].get();
		}
		for(i=0;i<=n-2;i++)
		{
			for(j=0;j<=n-2;j++)
			{
				if(s[j].greater(s[j+1]))
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		System.out.println("ID\tName\tPhy\tChem\tMath\tTotal");
		for(i=0;i<=n-1;i++)
		{
			s[i].put();
		}
	}
}