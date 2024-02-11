import java.util.*;
class ch2P46
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 for Addition");
		System.out.println("2 for Substraction");
		System.out.println("3 for Multiply");
		System.out.println("4 for Division");
		System.out.println("5 for Modulus");
		System.out.println("6 for Exit");
		System.out.println("Enter your choice ");
		int ch = sc.nextInt();
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(ch)
		{
		case 1:
		int sum=a+b;
		System.out.println("Sum is="+sum);
		break;
		case 2:
		int sub=a-b;
		System.out.println("difference is="+sub);
		break;
		case 3:
		int mul=a*b;
		System.out.println("Multiplication is="+mul);
		break;
		case 4:
		int div=a/b;
		System.out.println("Division is="+div);
		break;
		case 5:
		int mod=a%b;
		System.out.println("Modulus is="+mod);
		break;
		case 6:
		System.exit(0);
		break;
		default:System.out.println("Invalid choice");
		}
	}
}