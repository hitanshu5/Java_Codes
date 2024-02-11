import java.util.Scanner;
class MarksOutOfBoundsException extends Exception 
{
	public MarksOutOfBoundsException(String message) 
	{
		super(message);
	}
}
class Student 
{
	private String name;
	private int marks;
	public Student(String name, int marks) throws MarksOutOfBoundsException 
	{
		this.name = name;
		if (marks < 0 || marks > 100) 
		{
			throw new MarksOutOfBoundsException("Invalid marks entered!");
		}
		this.marks = marks;
	}
	public void displayDetails() 
	{
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
	}
}
public class Exp10p2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try 
		{
			System.out.print("Enter the name and Marks of Student 1: ");
			Student student1 = new Student(sc.next(), sc.nextInt());
			student1.displayDetails();
			System.out.print("Enter the name and Marks of Student 2: ");
			Student student2 = new Student(sc.next(), sc.nextInt()); 
			student2.displayDetails();
		} 	
		catch (MarksOutOfBoundsException e) 
		{
			System.out.println("Exception caught: " + e.getMessage());
		} 
	}
}


