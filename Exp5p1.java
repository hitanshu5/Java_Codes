import java.util.*;
class Exp5p1
{
	int factorial(int n);
	{
		if(n==0) return 1;
		return(n*factorial(n-1));
	}
	public static void main(String args)
	{
		int n,fact;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		Exp5p1 e=new Exp5p1();
		fact=e.factorial(n);
		System.out.println("Factorial="+fact);
	}
}