class Trial
{
	 public static void main(String[] args) {
	 	int a=0;
	 	int b=1;
	 	int c=0;
	 	for(int i=1;i<=4;i++)  //rows for upper triangle
	 	{
	 		for(int j=5-i;j>1;j--)
	 		{
	 			System.out.print("\t \t"); //spaces
	 		}

	 		for(int k=1; k<=((2*i)-1);k++)
	 		{
	 			if(k==1 || k==((2*i)-1))
	 			{
	 				System.out.print("\t * \t");
	 			}

	 			else
	 			{
	 				c=a+b;
	 				System.out.print("\t"+c + "\t");
	 				a=b;
	 				b=c;
	 			}
	 		}
	 		System.out.println();
	 	}

	 	for(int i=3;i>=1;i--)
	 	{
	 		for(int j=(4-i);j>=1;j--)
	 		{
	 			System.out.print("\t \t");
	 		}

	 		for(int k=((2*i)-1);k>=1;k--)
	 		{
	 			if(k==1 || k==((2*i)-1))
	 			{
	 				System.out.print("\t * \t");
	 			}

	 			else
	 			{
	 				c=a+b;
	 				System.out.print("\t"+c + "\t");
	 				a=b;
	 				b=c;
	 			}
	 		}
	 		System.out.println();
	 	}
	 }
}