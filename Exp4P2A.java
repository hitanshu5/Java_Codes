import java.util.*;
class Exp4P2A
{
	public static void main(String args[])
	{
		int i,n;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of strings:");
		n=sc.nextInt();
		sc.nextLine();
		ArrayList v=new ArrayList();
		for(i=0;i<=n-1;i++)
		{
			System.out.println("Enter a string:");
			str=sc.nextLine();
			v.add(str);
		}
		System.out.println("Names entered are:");
		for(i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("Enter another string:");
		str=sc.nextLine();
		i=v.indexOf(str);
		if(i==-1) v.add(str);
		else v.remove(i);
		System.out.println("Final List is:");
		for(i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
	}
}