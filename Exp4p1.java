import java.util.*;
class Exp4p1
{
	public static void main(String args[])
	{
		Vector names = new Vector();
		for(int i =0;i<args.length;i++)
		{
			names.addElement(args[i]);
		}
		System.out.println("Student names: ");
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.elementAt(i));
		}
	}
}