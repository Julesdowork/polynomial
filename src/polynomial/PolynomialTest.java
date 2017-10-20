package polynomial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class PolynomialTest
{
	@Test
	void test01HighOrderTerm()
	{
		Term term = Term.getTerm("5x^12");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(5,12)", actual);
	}
	
	@Test
	void test02LowOrderTerm()
	{
		Term term = Term.getTerm("4x^3");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(4,3)", actual);
	}
	
	@Test
	void test03OrderOfOne()
	{
		Term term = Term.getTerm("3x");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(3,1)", actual);
	}
	
	@Test
	void test04Constant()
	{
		Term term = Term.getTerm("2");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(2,0)", actual);
	}
	
	@Test
	void test05NoFactor()
	{
		Term term = Term.getTerm("x^4");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(1,4)", actual);
	}
}
