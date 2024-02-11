import java.util.*;
public class Exp2p1
{
public static void main(String args[])
{
int a[]=new int[100];
int i,n,j,sum;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of array elements");
n=sc.nextInt();
System.out.println("Enter the array elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Input array:");
for(i=0;i<n;i++)
{
System.out.println("Element no."+(i+1)+"="+a[i]);
}
System.out.println("Output:");
for(i=0;i<n;i++)
{
sum=0;
for(j=0;j<n;j++)
{
if(i!=j)
{
sum=sum+a[j];
}
}
System.out.println("Element no."+(i+1)+"="+sum);
}
}
}
