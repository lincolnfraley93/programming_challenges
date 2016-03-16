/**
 * Cracking the Coding Interview
 * 'Implement an algorithm to determine if a string has all unique
 * characters. 2nd part: Do without an additional data structure.'
 * 
 * @author Lincoln Fraley
 * December 28, 2015
 */
public class IsUnique 
{
	
	public static boolean withDataStructure(String string)
	{
		//  Indices refer to ASCII values of characters in the string
		//  parameter. Index element is set to '1' when the character
		//  with that ASCII value is encountered.
		int[] asciiArray = new int[128];
		
		for (int i = 0; i < string.length(); i++)
		{
			if (asciiArray[(int) string.charAt(i)] == 1)
			{
				return false;
			}
			else
			{
				asciiArray[(int) string.charAt(i)] = 1;
			}
		}
		return true;
	}
	
	/*public static boolean withoutDataStructure(String string)
	{
		
	}*/
	public static void main (String[] args)
	{
		
	}
}
