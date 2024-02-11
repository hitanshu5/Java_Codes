import java.util.*;
class Exp4p2
{
	public static void main(String args[])
	{
		int i,n;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Strings ");
		n=sc.nextInt();
		sc.nextLine();
		Vector v = new Vector();
		for(i=0;i<=n-1;i++)
		{
			System.out.println("Enter a String ");
			str=sc.nextLine();
			v.addElement(str);
		}
		System.out.println("'Names Entered are: ");
		for(i=0;i<v.size();i++)
		{
			System.out.println(v.elementAt(i));
		}
		System.out.println("Enter another String");
		str=sc.nextLine();
		i=v.indexOf(str);
		if(i==-1) v.addElement(str);
		else v.removeElementAt(i);
		System.out.println("Final list is");
		for(i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.elementAt(i));
		}
	}
}
