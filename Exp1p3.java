public class Exp1p3
{
public static void main(String args[])
{
int n,count=0;
n=Integer.parseInt(args[0]);
do
{
n=n/10;
count++;
}while(n!=0);
System.out.println("no of digits:"+count);
}
} 




