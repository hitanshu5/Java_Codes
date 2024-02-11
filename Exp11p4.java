import java.util.*;
class Ticket extends Thread
{
	int vacant=1,required;
	Ticket(int x)
	{
		required=x;
	}
	public synchronized void run()
	{
		if(vacant>=required)
		{
			System.out.println(required+" tickets booked for "+Thread.currentThread().getName());
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
			}
			vacant-=required;
		}
		else
		{
			System.out.println("SoldOut "+Thread.currentThread().getName());
		}
	}	
}
class Exp11p4
{
	public static void main(String args[])
	{
		Ticket t=new Ticket(1);
		Thread th1=new Thread(t);
		Thread th2=new Thread(t);
		th1.setName("alpha");
		th2.setName("beta");
		th1.start();
		th2.start();
	}
}

