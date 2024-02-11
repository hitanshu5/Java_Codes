import java.util.*;
public class Exp1p4
{
	public static void main(String args[])
	{
		int n1,n2,choice=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		while(choice!=6)
		{
			System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.divide\n5.mode\n6.Exit\nEnter your Choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("The addition is:"+(n1+n2));
				break;
				case 2:
				System.out.println("The subtraction is:"+(n1-n2));
				break;
				case 3:
				System.out.println("The multiplication is:"+(n1*n2));
				break;
				case 4:
				System.out.println("The quotient is:"+(n1/n2));
				break;
				case 5:
				System.out.println("The remainder is:"+(n1%n2));
				break;
				case 6:
				break;
				default: 
				System.out.println("Invalid choice");
			}
		}
	}
}





