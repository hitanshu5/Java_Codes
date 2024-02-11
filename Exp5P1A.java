import java.util.*;
class Exp5P1A
{
	static int facto(int n)
	{
		if(n==0) return 1;
		return(n*facto(n-1));
	}
	public static void main(String args[])
	{
		int n,fact;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		fact=facto(n);
		System.out.println("Factorial:"+fact);
	}
}