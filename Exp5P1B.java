import java.util.*;
class Exp5P1B
{
	int facto(int n)
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
		Exp5P1B e=new Exp5P1B();
		fact=e.facto(n);
		System.out.println("Factorial:"+fact);
	}
}