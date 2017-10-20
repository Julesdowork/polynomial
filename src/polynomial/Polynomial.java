package polynomial;

/**
 * A polynomial is a mathematical function with an arbitrary amount of terms.
 * @author Julian McNeill
 */
public class Polynomial
{
	private String polyString;
	private LinkedList terms;
	
	public Polynomial()
	{
		terms = new LinkedList();
	}
	
	public Polynomial(String aString)
	{
		polyString = aString;
		terms = new LinkedList();
		getTerms(polyString);
	}
	
	public Polynomial addPolynomials(Polynomial other)
	{
		ListIterator thisIter = terms.listIterator();
		ListIterator otherIter = other.terms.listIterator();
		String newPolyString = "";
		
		while (thisIter.hasNext())
		{
			Term thisTerm = (Term) thisIter.next();
			while (otherIter.hasNext())
			{
				Term otherTerm = (Term) otherIter.next();
				if (thisTerm.getPower() == otherTerm.getPower())
				{
					int sum =
						thisTerm.getCoefficient() + otherTerm.getCoefficient();
					if (sum < 0)
						newPolyString += "-";
					else if (sum > 0)
					{
						if (newPolyString.equals(""))
							newPolyString = Integer.toString(sum);
						else
							newPolyString += "+" + Integer.toString(sum);
					}
					
					if (thisTerm.getPower() != 0)
					{
						if (thisTerm.getPower() == 1)
							newPolyString += "x";
						else
							newPolyString += "x^" + thisTerm.getPower();
					}
					break;
				}
			}
		}
		
		Polynomial sum = new Polynomial(newPolyString);
		return sum;
	}
	
	public void getTerms(String aString)
	{
		int end = 0;
		int start = 0;
		String substring = "";
		ListIterator iter = terms.listIterator();
		
		while (end < aString.length())
		{
			if (aString.charAt(end) == '+' || aString.charAt(end) == '-')
			{
				if (end == 0)
				{
					start = end;
					end++;
					while (end < aString.length() && aString.charAt(end) != '+'
							&& aString.charAt(end) != '-')
						end++;
				}
				substring = aString.substring(start, end);
				Term newTerm = Term.getTerm(substring);
				iter.add(newTerm);
				start = end;
			}
			end++;
		}
		if (start < aString.length())
		{
			substring = aString.substring(start);
			Term newTerm = Term.getTerm(substring);
			iter.add(newTerm);
		}
	}
	
	public String printTerms()
	{
		String termStr = "";
		ListIterator iter = terms.listIterator();
		while (iter.hasNext())
		{
			termStr += iter.next().toString();
			termStr += " ";
		}
		return termStr;
	}
	
	public String toString()
	{
		return polyString;
	}
}
