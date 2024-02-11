import java.util.*;
public class Exp1p2b
{
public static void main(String args[])
{
int a,b,c,large;
Scanner sc= new Scanner(System.in);
System.out.println("Enter three numbers:");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
large=(a>b)?a:b;
large=(large>c)?large:c;
System.out.println("Largest of the 3 is:"+large);
}
}




