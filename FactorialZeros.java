/**
 * Question 16.5, Cracking the Coding Interview
 * Write a function which computes the number of trailing zeros in
 * n factorial.
 * 
 * @author Lincoln Fraley
 * January 16, 2016
 */
public class FactorialZeros 
{
	public static int zeros(int n)
	{
		int zeros = 0;
		
		if ((n / 5) >= 0)
		{
			zeros = (n / 5);
		}
		
		return zeros;
	}
	
	public static void main(String[] args) 
	{
		long n = 1;
		
		for (int i = 1; i <= 20; i ++)
		{
			n = n*i;
			System.out.print(i + " factorial: " + n + ", ");
			System.out.println("num of zeros: " + zeros(i));
		}
	}

}
