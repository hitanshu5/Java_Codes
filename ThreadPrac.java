class Number extends Thread
{
	public void run()
	{
		int i;
		synchronized(this)
		{
			for(i=1;i<=10;i++)
			{
				System.out.println(i);
				
			}
		}
	}
}
class ThreadPrac
{
	public static void main(String args[])
	{
		Number n=new Number();
		Thread t1=new Thread(n);
		Thread t2=new Thread(n);
		t1.start();
		t2.start();
	}
} 