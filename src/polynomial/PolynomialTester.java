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
		String polyStr;
		polyStr = in.nextLine();
		polyStr = polyStr.replaceAll(" ", "");
		Polynomial px = new Polynomial(polyStr);
		
		System.out.println("\nOptions:");
		System.out.println("\t1. Add polynomials");
		System.out.println("\t2. Multiply polynomials");
		System.out.println("\t3. Print polynomial");
		System.out.println("\t4. Compute derivative");
		System.out.println("\t5. Supply new polynomial");
		System.out.println("\t0. Quit");
		System.out.print("Enter choice: ");
		int choice = in.nextInt();
		while (choice != 0)
		{
			while (choice < 0 || choice > 5)
			{
				System.out.println("That's not a valid choice. Please try "
						+ "again.");
				System.out.print("Enter choice: ");
				choice = in.nextInt();
			}
			
			if (choice == 1)
			{
				in.nextLine();
				System.out.println("Enter new polynomial below (ignore spaces):");
				polyStr = in.nextLine();
				polyStr = polyStr.replaceAll(" ", "");
				Polynomial qx = new Polynomial(polyStr);
				px = px.addPolynomials(qx);
				System.out.println("New polynomial: " + px.toString());
			}
			else if (choice == 2)
			{
				// Multiply polynomials
			}
			else if (choice == 3)
			{
				System.out.println(px.toString());
				System.out.println(px.printTerms());
			}
			else if (choice == 4)
			{
				// Compute derivative
			}
			else
			{
				in.nextLine();
				System.out.println("Enter new polynomial below (ignore spaces):");
				polyStr = in.nextLine();
				polyStr = polyStr.replaceAll(" ", "");
				px = new Polynomial(polyStr);
			}
			
			System.out.println("\nOptions:");
			System.out.println("\t1. Add polynomials");
			System.out.println("\t2. Multiply polynomials");
			System.out.println("\t3. Print polynomial");
			System.out.println("\t4. Compute derivative");
			System.out.println("\t5. Supply new polynomial");
			System.out.println("\t0. Quit");
			System.out.print("Enter choice: ");
			choice = in.nextInt();
		}
		
		System.out.println("\nDone.");
	}
}
