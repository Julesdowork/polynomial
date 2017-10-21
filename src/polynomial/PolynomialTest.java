package polynomial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PolynomialTest
{
	@Test
	void test01Term5()
	{
		Term term = Term.getTerm("5");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(5,0)", actual);
	}
	
	@Test
	void test02Term0()
	{
		Term term = Term.getTerm("");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(0,0)", actual);
	}
	
	@Test
	void test03Term10()
	{
		Term term = Term.getTerm("10");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(10,0)", actual);
	}
	
	@Test
	void test04TermMinus7()
	{
		Term term = Term.getTerm("-7");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(-7,0)", actual);
	}
	
	@Test
	void test05TermX()
	{
		Term term = Term.getTerm("x");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(1,1)", actual);
	}
	
	@Test
	void test06TermMinusX()
	{
		Term term = Term.getTerm("-x");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(-1,1)", actual);
	}
	
	@Test
	void test07TermPlusX()
	{
		Term term = Term.getTerm("+x");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(1,1)", actual);
	}
	
	@Test
	void test08Term2X()
	{
		Term term = Term.getTerm("2x");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(2,1)", actual);
	}
	
	@Test
	void test09TermMinus2X()
	{
		Term term = Term.getTerm("-2x");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(-2,1)", actual);
	}
	
	@Test
	void test09TermPlus2X()
	{
		Term term = Term.getTerm("+2x");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(2,1)", actual);
	}
	
	@Test
	void test10Term9X2()
	{
		Term term = Term.getTerm("9x^2");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(9,2)", actual);
	}
	
	@Test
	void test11Term4X10()
	{
		Term term = Term.getTerm("4x^10");
		int coefficient = term.getCoefficient();
		int power = term.getPower();
		String actual = "(" + coefficient + "," + power + ")";
		assertEquals("(4,10)", actual);
	}
}
