import java.util.*;
public class Exp1p5b
{
	public static void main(String args[])
	{
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks:");
		marks=sc.nextInt();
		switch(marks/10)
		{
			case 10 :
			case 9 :
			System.out.println("O");
			break;
			case 8 :
			System.out.println("A+");
			break;
			case 7 :
			System.out.println("A");
			break;
			case 6 :
			System.out.println("B+");
			break;
			case 5 :
			System.out.println("B");
			break;
			case 4 :
			System.out.println("C");
			break;
			default:
			System.out.println("Fail");
		 }
	}
} 




