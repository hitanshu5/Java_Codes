public class Exp5p4
{
	static int count;
	public Exp5p4()
	{
		count++;
	}
	public static int displayCount()
	{
		return count;
	}

	public static void main(String args[])
	{
		Exp5p4 ob1 = new Exp5p4();
		Exp5p4 ob2 = new Exp5p4();
		Exp5p4 ob3 = new Exp5p4();
		Exp5p4 ob4 = new Exp5p4();
		Exp5p4 ob5= new Exp5p4();
		System.out.print("Total Number of Objects: " + displayCount());
	}
}