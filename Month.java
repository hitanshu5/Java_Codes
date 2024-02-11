import java.io.*;
class MonthNumberException extends Exception
{
	public MonthNumberException(String str)
	{
		System.out.println(str);
	}
}
class Month
{
	public static void main(String args[]) throws IOException
	{
		int m;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		String str;
		System.out.println("Enter a number");
		str=br.readLine();
		m=Integer.parseInt(str);
		try
		{
			if(m>12 || m<1)
			throw new MonthNumberException("Invalid Month Number");
			System.out.println("Month number entered is "+m);
		}
		catch(MonthNumberException mne)
		{
		}
	}
}