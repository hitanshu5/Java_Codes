import java.util.*;
class Student
{
	protected int rollno;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll no");
		rollno=sc.nextInt();
				
	}	
}
class Test extends Student  
{
	protected int sem1,sem2;
	public void read()
	{
		super.read();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sem1 marks");
		sem1=sc.nextInt();
		System.out.println("Enter Sem2 marks");
		sem2=sc.nextInt();
	}
}
interface sports
{
	int in=100,na=75,st=50;
	public void score();
}
class Result extends Test implements sports
{
	private int total;
	public void score()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.international\n2.national\n3.state\nEnter your Choice");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1: total=sem1+sem2+in;
		           	            break;
			case 2: total=sem1+sem2+na;
		           	            break;
			case 3: total=sem1+sem2+st;
		           	            break;
			default: total=sem1+sem2;
			             break;
		}
	}
	public void display()
	{
		System.out.println("Rollno= "+rollno+"\nSem1 marks= "+sem1+"\nSem2 marks= "+sem2+"\nTotal= "+total);
	}
}
class Ex8p1
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		n=sc.nextInt();
		Result r[]=new Result[n];
		for(i=0;i<n;i++)
		{
			r[i]=new Result();
			r[i].read();
			r[i].score();
			r[i].display();
		}
	}
}
			
				
			
		
	