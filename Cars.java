import java.util.*;
class Cars
{
void display()

{
System.out.println("Cars");
}
}

class Ferrari extends Cars
{
void display()
{
System.out.println("Ferrari");
}
}

class Audi extends Ferrari
{
void display()
{
System.out.println("Audi");
}
}
class Main
{
public static void main(String[] args)
{
Cars obj=new Cars();
obj.display();

obj =new Ferrari();
obj.display();

obj=new Audi();
obj.display();
}
}


