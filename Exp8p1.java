import java.util.*;
class Student
{
	protected int rollno;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ROLL NUMBER : ");
		rollno=sc.nextInt();
	}
}
class Test extends Student
{
	protected int sem1_marks,sem2_marks;
	public void read()
	{
		super.read();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER SEM 1 AND 2 MARKS : ");
		sem1_marks=sc.nextInt();
		sem2_marks=sc.nextInt();
	}
}
interface Sports
{
	public void score();
}
class Result extends Test implements Sports
{
	private int score,total;
	public void score()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER SCORE : ");
		score=sc.nextInt();
		total=sem1_marks+sem2_marks+score;
		System.out.println("TOTAL IS : "+total);
	}
}
public class Exp8p1
{
	public static void main(String args[])
	{
		Result r=new Result();
		r.read();
		r.score();
	}
}

