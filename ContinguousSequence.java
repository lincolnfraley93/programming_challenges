/**
 * Question 16.17, Cracking the Coding Interview
 * Given an array of positive and negative integers, find the 
 * continguous sequence with the largest sum.
 * 
 * @author Lincoln Fraley
 * January 14, 2016
 */
public class ContinguousSequence 
{
	public static int contiguousSequence(int[] array)
	{
		int start = 0;
		int end = 0;
		int sum = array[0];
		
		for (int i = 1; i < array.length; i++)
		{
			if ((array[i] + sum) <= array[i])
			{
				start = i;
				end = i;
				sum = array[i];
			}
			else
			{
				sum = sum + array[i];
			}
		}
		System.out.println("start: " + start);
		System.out.println("end: " + end);
		return sum;
	}
	public static void main(String[] args) 
	{
		int[] array = {2, -8, 3, -2, 4, -10};
		
		System.out.println(contiguousSequence(array));

	}

}
