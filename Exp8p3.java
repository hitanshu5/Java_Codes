import java.util.*;
class Parent
{
	public void display(int r)
	{
		System.out.println("THIS IS PARENT CLASS : ");
		System.out.println(r);
	}
}
class Child extends Parent
{
	public void display(int r)
	{
		System.out.println("THIS IS CHILD CLASS : ");
		System.out.println(r);
	}
}
public class Exp8p3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.PARENT\n2.CHILD\nENTER CHOICE : ");
		int choice = sc.nextInt();
		Parent ref;
		Parent p=new Parent();
		Child c=new Child();
		if(choice==1) ref=p;
		else ref=c;
		ref.display(50);
	}
}

