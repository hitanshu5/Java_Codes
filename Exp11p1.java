import java.util.*;
class Table implements Runnable
{
	private int i,n;
	public Table(int x)
	{
		n=x;
	}
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"X"+i+"="+(n*i));
		}
	}
}
class Exp11p1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Table t1=new Table(5);
		Thread th1=new Thread(t1);
		th1.start();
		try
		{
			th1.join();
		}
		catch(InterruptedException ie)
		{
		}
		Table t2=new Table(7);
		Thread th2=new Thread(t2);
		th2.start();
		try
		{
			th2.join();
		}
		catch(InterruptedException ie)
		{
		}
		Table t3=new Table(9);
		Thread th3=new Thread(t3);
		th3.start();
	}
}

