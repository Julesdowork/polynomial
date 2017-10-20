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
		int pow = 0;	// Default values for coefficient and power
		String coeStr = "";
		String powStr = "";
		int i = 0;
		int j = i;
		
		while (j < aString.length() && !Character.isLetter(aString.charAt(j)))
		{
			coeStr += aString.charAt(j);
			j++;
		}
		if (!coeStr.equals(""))
		{
			if (coeStr.charAt(0) == '-')
			{
				coe = Integer.parseInt(coeStr.substring(1));
				coe = -coe;
			}
			else if (coeStr.charAt(0) == '+')
				coe = Integer.parseInt(coeStr.substring(1));
			else
				coe = Integer.parseInt(coeStr);
		}
		
		if (j < aString.length() && Character.isLetter(aString.charAt(j)))
			pow = 1;
		
		j++;
		if (j < aString.length() && aString.charAt(j) == '^')
		{
			j++;
			do
			{
				powStr += aString.charAt(j);
				j++;
			} while (j < aString.length());
			pow = Integer.parseInt(powStr);
		}
	
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
