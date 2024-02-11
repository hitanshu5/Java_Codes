public class Exp10p1
{
	public static void main(String[] args) 
	{
		try 
		{
			String nullString = null;
			System.out.println(nullString.length()); 
		} 	
		catch (Exception e) 
		{
			System.out.println("Exception caught:\n" + e);
		}
		try 
		{
			String str = "abc";
			int number = Integer.parseInt(str); // NumberFormatException
		} 
		catch (NumberFormatException e) 
		{
			System.out.println("NumberFormatException caught:\n" + e);
		}
		try 
		{
			int numerator = 10;
			int denominator = 0;
			int result = numerator / denominator; // ArithmeticException
		} 	
		catch (ArithmeticException e) 
		{
			System.out.println("ArithmeticException caught:\n" + e);
		}
		try 
		{
			int[] numbers = { 1, 2, 3 };
			int element = numbers[4]; // ArrayIndexOutOfBoundsException
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException caught:\n" + e);
		}
	}
}


