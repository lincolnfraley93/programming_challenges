/**
 * Question 1.4, 'Cracking the Coding Interview'
 * Given a string, write a function to check if it is a permutation
 * of a palindrome. A palindrome is a word or phrase that is the same
 * forwards and backwards.
 * 
 * @author Lincoln Fraley
 *
 */
public class PalindromePermutation 
{
	
	public static boolean palindromePermutation(String string)
	{
		//  Remove whitespace 
		string = string.replaceAll("\\s+", "");
		
		//  Array to keep track of unique characters in string, and
		//  counter to hold number of unique characters
		int[] asciiArray 			= new int[128];
		int   numOfUniqueCharacters = 0;
		
		//  Max allowed number of unique characters, depending on 
		//  length of string being even or odd
		int maxUniqueCharacters;
		if ((string.length() % 2) == 0)
		{
			maxUniqueCharacters = string.length() / 2;
		}
		else
		{
			maxUniqueCharacters = (string.length() / 2) + 1;
		}
		
		//  Loop through string
		for (int i = 0; i < string.length(); i++)
		{
			//  Check array to see if current char in string has
			//  already been encountered
			if (asciiArray[(int) string.charAt(i)] == 0)
			{
				asciiArray[(int) string.charAt(i)]+=1;
				numOfUniqueCharacters+=1;
				
				//  Check if more than allowed number of unique
				//  characters has been encountered
				if (numOfUniqueCharacters > maxUniqueCharacters)
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(palindromePermutation("poope"));

	}

}
