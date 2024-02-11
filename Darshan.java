import java.util.*;
class Darshan
{
public static void main(String[] args)
{
 String a;
 int i,l,up=0,lw=0,no=0,b=0;
 char ch;
 Scanner ob=new Scanner(System.in);
 System.out.println("Enter a string: ");
 a=ob.nextLine();
 l=a.length();
 for(i=0;i<l;i++)
 {
ch =a.charAt(i);
 if(Character.isUpperCase(ch))
 up++;
 else if(Character.isLowerCase(ch))
 lw++;
 else if(ch==' ')
 b++;
else
 no++;
 }
 System.out.println("\nUpper case: "+up+"\nLower case: "+lw+"\nblank space: "+b+"\nno: "+no);
 }
}