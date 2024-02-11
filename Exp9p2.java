import java.util.Scanner;
import volume.Cylinder;
public class Exp9p2 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius and Height of Cylinder: ");
		Cylinder cylinder = new Cylinder(sc.nextDouble(),sc.nextDouble());
		double volume = cylinder.volume();
		System.out.println("Volume of the cylinder: " + volume);
	}
}

