/**
 * Question 5.3, Cracking the Coding Interview
 * Given an integer, you can flip exactly one bit from 0 to 1. Find
 * the longest sequence of 1s that can be created.
 * 
 * @author Lincoln Fraley
 * January 15, 2016
 */
public class FlipBit 
{
	public static int flipBit(int n)
	{
		int current = 0;
		int previous = 0;
		int sum = 0;
		
		while (n > 0)
		{
			if ((n % 2) == 1)
			{
				current++;
			}
			if ((n % 2) == 0)
			{
				if ((previous + current) > sum)
				{
					sum = previous + current;
				}
				previous = current;
				current = 0;
			}
			n = n >> 1;
		}
		
		return (sum + 1);
	}
	public static void main(String[] args) 
	{
		int n = 1775;
		
		System.out.println(flipBit(n));
	}

}
