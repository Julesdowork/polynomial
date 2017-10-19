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
		Term a = Term.getTerm("5x^10");
		Term b = Term.getTerm("4x");
		Term c = Term.getTerm("3");
		System.out.printf("(%d, %d)\n", a.getCoefficient(), a.getPower());
		System.out.printf("(%d, %d)\n", b.getCoefficient(), b.getPower());
		System.out.printf("(%d, %d)\n", c.getCoefficient(), c.getPower());
	}
}
