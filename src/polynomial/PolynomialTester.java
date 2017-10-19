package polynomial;

import java.util.Scanner;

public class PolynomialTester
{
	public static void main(String[] args)
	{
		System.out.println("Polynomial Calculator");
		System.out.println("Performs basic operations on polynomial functions\n");
		
		System.out.println("Enter a polynomial below (ignore spaces):");
		Scanner in = new Scanner(System.in);
		String polynomial;
		polynomial = in.nextLine();
		polynomial = polynomial.replaceAll(" ", "");
		//System.out.println(polynomial);
		
	}
}
