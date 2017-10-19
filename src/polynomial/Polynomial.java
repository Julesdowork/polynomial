package polynomial;

/**
 * A polynomial is a mathematical function with an arbitrary amount of terms.
 * @author Julian McNeill
 */
public class Polynomial
{
	private String polyString;
	private LinkedList terms;
	
	public Polynomial(String aString)
	{
		polyString = aString;
		terms = getTerms(polyString);
	}
	
	public LinkedList getTerms(String aString)
	{
		LinkedList list = new LinkedList();
		int index = 0;
		int lastIndex = 0;
		String substring = "";
		
		while (index < aString.length())
		{
			if (aString.charAt(index) == '+' || aString.charAt(index) == '-')
			{
				substring = aString.substring(lastIndex, index);
				Term newTerm = Term.getTerm(substring);
			}
			index++;
		}
	}
}
