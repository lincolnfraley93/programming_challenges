/**
 * Provides utility method for printing an array of integers
 * 
 * @author Lincoln Fraley
 * January 12, 2016
 */
public class PrintArray 
{
	public static void printArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (i == (array.length - 1))
			{
				System.out.print(array[i]);
			}
			else
			{
				System.out.print(array[i] + ", ");
			}
		}
	}
}
