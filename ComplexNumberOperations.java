import java.util.*;

// User Defined Complex class
class Complex {

	// Declaring variables
	private float real, img;

	// Empty Constructor
	public Complex()
	{
	}

	// Constructor to accept
	// real and imaginary part
	public Complex(float x, float y)
	{
		real = x;
		img = y;
	}

	// Defining addComp() method
	// for adding two complex number
	public Complex addComp(Complex C2)
	{
		// adding real part of complex numbers
		Complex c3=new Complex();
		c3.real = real + C2.real;

		// adding Imaginary part of complex numbers
		c3.img= img + C2.img;

		// returning the sum
		return c3;
	}

	// Defining subtractComp() method
	// for subtracting two complex number
	public Complex subtractComp( Complex C2)
	{
		
		Complex c3=new Complex();
		c3.real = real - C2.real;

		// subtracting Imaginary part of complex numbers
		c3.img= img - C2.img;

		// returning the diff
		return c3;
	}

	// Function for printing complex number
	public void printComplexNumber()
	{
		
		if(img>=0)
			System.out.println("Complex number: "+ real + " + "+ img + "i");
		else
			System.out.println("Complex number: "+ real + img + "i");
	}
}

// Main Class
public class ComplexNumberOperations {

	// Main function
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float x,y;
		System.out.print("Enter the values of real and imaginary part of the first complex number:");
		x=sc.nextFloat();
		y=sc.nextFloat();
		// First Complex number
		Complex C1 = new Complex(x,y);

		// printing first complex number
		C1.printComplexNumber();
		System.out.print("Enter the values of real and imaginary part of the second complex number:");
		x=sc.nextFloat();
		y=sc.nextFloat();

		// Second Complex number
		Complex C2 = new Complex(x,y);

		// printing second complex number
		C2.printComplexNumber();

		// for Storing the sum
		Complex C3;

		// calling addComp() method
		C3 = C1.addComp( C2);

		// printing the sum
		System.out.print("Sum of :");
		C3.printComplexNumber();

		// calling subtractComp() method
		C3 = C1.subtractComp( C2);

		// printing the difference
		System.out.print("Difference of :");
		C3.printComplexNumber();
	}
}
