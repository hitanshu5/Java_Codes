import java.util.Scanner;
class Base
{
	private int x=15;
	public void display()
	{
		System.out.println("Base class\nx="+x);
	}
}
class Child extends Base
{
	private int x=5;
	public void display()
	{
		System.out.println("Child class\nx="+x);
	}
}
class Ex8p3
{
	public static void main(String args[])
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		Base b = new Base();
		Child c = new Child();
		Base ref;
		System.out.println("1.Base\n2.Child\nEnter your choice");
		choice=sc.nextInt();
		if(choice==1) ref=b;
		else ref=c;
		ref.display();
	}
}
		
		
