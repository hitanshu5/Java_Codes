final class Test
{}
class t1 extends Test
{}
class t2
{
	public final void read()
	{
		final int a=100;
		a=10;
	}
}
class t3 extends t2
{
	public void read()
	{}
}