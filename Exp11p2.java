import java.util.*;
class Exp11p2
{
	public static void main(String args[])
	{
		Pattern1 p1=new Pattern1();
		Thread th1=new Thread(p1);
		th1.start();
		Pattern2 p2=new Pattern2();
		Thread th2=new Thread(p2);
		th2.start();
	}
}
class Pattern1 implements Runnable
{
	int i;
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			System.out.print("*");
			try
			{
				Thread.sleep(99);
			}
			catch(InterruptedException ie)
			{	
			}
		}
	}
}
class Pattern2 implements Runnable
{
	int i;
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			System.out.print("/");
			try
			{
				Thread.sleep(99);
			}
			catch(InterruptedException ie)
			{	
			}
		}
	}
}

