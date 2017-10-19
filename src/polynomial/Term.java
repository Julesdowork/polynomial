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
	
	public static Term getTerm(String aString)
	{
		int coe = 1;
		int pow = 0;	// Default values for coefficient and power
		int i = 0;
		int j = i;
		
		while (j < aString.length() && !Character.isLetter(aString.charAt(j)))
		{
			j++;
		}
		if (i != j)
			coe = Integer.parseInt(aString.substring(i, j));
		
		if (Character.isLetter(aString.charAt(j)))
		{
			j++;
			while (j < aString.length() && aString.charAt(j) == '^')
			{ 
				j++;
				i = j;
				while (j < aString.length())
					j++;
				pow = Integer.parseInt(aString.substring(i, j));
			}
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
}
