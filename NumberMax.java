/**
 * Question 16.7, Cracking the Coding Interview
 * Return the maximum of two numbers without using any comparison
 * operators.
 * 
 * @author Lincoln Fraley
 * January 16, 2016
 */
public class NumberMax 
{
	public static int noComparisonMax(int a, int b)
	{
		int result = 0;
		int difference = Math.abs(a - b);
		result = (difference + a + b) / 2;
		return result;
	}
	
	public static void main(String[] args) 
	{
		int a = 2;
		int b = 7;
		
		System.out.println(noComparisonMax(a, b));

	}

}
