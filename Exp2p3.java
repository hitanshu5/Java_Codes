import java.util.*;
public class Exp2p3
{
public static void main(String args[])
{
int a[][]=new int[6][];
int i,j,k,n;
Scanner sc=new Scanner(System.in);
for(i=0;i<6;i++)
{
a[i]=new int[i+1];
}
for(i=0;i<6;i++)
{	
k=1;
for(j=0;j<a[i].length;j++)
{
a[i][j]=k;
k++;
}
}
for(i=0;i<6;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}
