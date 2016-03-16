/**
 * Question 8.3, Cracking the Coding Interview
 * A magic index in an array is defined to be an index such that 
 * A[i] = i. Given a sorted array of integers, find the magic index,
 * if it exists.
 * 
 * @author Lincoln Fraley
 * January 13, 2016
 */
public class MagicIndex 
{
	static int[] 	array;
	static int 		length;
	
	public static int magicIndex(int[] a)
	{
		array 	= a;
		length 	= (array.length - 1);
		
		if (array[0] > length)
		{
			return -1;
		}
		else
		{
			return magicIndex(0);
		}
	}
	
	private static int magicIndex(int start)
	{
		if (array[start] > length)
		{
			return -1;
		}
		else if (array[start] == start)
		{
			return start;
		}
		else
		{
			return magicIndex(array[start]);
		}
	}
	
	public static void main(String[] args) 
	{
		int[] array = {3, 3, 3, 3};
		
		System.out.println(magicIndex(array));

	}

}
