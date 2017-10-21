package polynomial;

/**
 * A term is a pair of numbers representing the coefficient and exponent of
 * a term in a polynomial function.
 * @author Julian McNeill
 */
public class Term
{
	private int coefficient;
	private int power;
	
	/**
	 * Constructs a term.
	 * @param coe the coefficient of x
	 * @param pow the power of x
	 */
	public Term(int coe, int pow)
	{
		coefficient = coe;
		power = pow;
	}
	
//	private static float getDecimalFromFraction(String aString, int loc)
//	{
//		String numerator = aString.substring(0, loc);
//		String denominator = aString.substring(loc + 1);
//		int num = Integer.parseInt(numerator);
//		int den = Integer.parseInt(denominator);
//		return num / den;
//	}
	
	public static Term getTerm(String aString)
	{
		int coe = 1;
		int pow = 0;
		String coeStr = "";
		String powStr = "";
		
		if (aString.length() == 0)
			return new Term(0, 0);
		
		int i = 0;
		while (i < aString.length() && !Character.isLetter(aString.charAt(i)))
		{
			coeStr += aString.charAt(i);
			i++;
		}
		if (coeStr.length() > 0 && !coeStr.equals("+"))
		{
			if (coeStr.equals("-"))
				coe = -1;
			else if (coeStr.charAt(0) != '+')
				coe = Integer.parseInt(coeStr);
			else
				coe = Integer.parseInt(coeStr.substring(1));
		}
		
		if (i < aString.length() && Character.isLetter(aString.charAt(i)))
		{
			pow = 1;
			i += 2;
		}
		
		while (i < aString.length())
		{
			powStr += aString.charAt(i);
			i++;
		}
		if (powStr.length() > 0)
			pow = Integer.parseInt(powStr);
		
		return new Term(coe, pow);
	}
	
	/**
	 * Gets the coefficient of x.
	 * @return the coefficient of x
	 */
	public int getCoefficient()
	{
		return coefficient;
	}
	
	/**
	 * Multiplies the coefficient (or the whole term really) by -1.
	 * @return the negative of the coefficient
	 */
	public int getNegative()
	{
		return -coefficient;
	}
	
	/**
	 * Gets the power of x.
	 * @return the power of x
	 */
	public int getPower()
	{
		return power;
	}
	
	/**
	 * Prints a string representation of this term.
	 * @return the string representation
	 */
	public String toString()
	{
		return "(" + coefficient + "," + power + ")";
	}
}
