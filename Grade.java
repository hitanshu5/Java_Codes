import java.util.*;
public class Grade
{
	public static void main(String args[])
	{
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks:");
		marks=sc.nextInt();
		if(marks>100)
		{
			System.out.println("Invalid input");
		}
		else if(marks>=90)
		{
			System.out.println("O");
		}
		else if(marks>=80)
		{
			System.out.println("A+");
		}
		else if(marks>=70)
		{
			System.out.println("A");
		}
		else if(marks>=60)
		{
			System.out.println("B+");
		}
		else if(marks>=50)
		{
			System.out.println("B");
		}
		else if(marks>=40)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}

