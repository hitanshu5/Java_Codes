public class CountObject
{
	static int count;

	public CountObject()
	{
		count++;
	}

	public static int displayCount()
	{
		return count;
	}

	public static void main(String args[])
	{
		CountObject ob1 = new CountObject();
		CountObject ob2 = new CountObject();
		CountObject ob3 = new CountObject();
		CountObject ob4 = new CountObject();
		CountObject ob5= new CountObject();
		System.out.print("Total Number of Objects: " + displayCount());
	}