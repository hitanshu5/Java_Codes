class Exp1_8
{
	public static void main(String args[])
	{
		int i,j,bs=3,k=1;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=bs;j++)
			{
			 	System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print((char) (k+64));		
			}
			System.out.println();
			bs--;	
		}
	}
}