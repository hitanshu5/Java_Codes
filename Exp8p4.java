class Test
{
}
class Exp8p4
{
	public static void main(String args[])
	{
		Test obj=new Test();
		obj=null;
		System.gc();
		System.out.println("DELETED ");
	}
}


