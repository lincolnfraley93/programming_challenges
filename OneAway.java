/**
 * 1.5, 'Cracking the Coding Interview'
 * Given two strings, write a function to check if they are one edit
 * (or zero edits) away. The three types of edits are: insert a 
 * character, remove a character, or replace a character.
 *
 * @author Lincoln Fraley
 * December 30, 2015
 */
import java.util.BitSet;

public class OneAway 
{
	public static boolean oneAway(String s1, String s2)
	{
		if (absDiff(s1.length(), s2.length()) > 1)
		{
			return false;
		}
		else
		{
			//  Use array to reference ASCII values of characters in
			//  s1
			int[] asciiArray = new int[128];
			for (int i = 0; i < s1.length(); i++)
			{
				asciiArray[(int) s1.charAt(i)]+=1;
			}
			
			//  Counter refers to number of differences between 
			//  strings
			int numOfDifferences = 0;
			
			//  Loop through s2; for each character, refer to 
			//  asciiArray; if asciiArray element at current position
			//  is 0, increment numOfDifferences
			for (int i = 0; i < s2.length(); i++)
			{
				if (asciiArray[(int) s2.charAt(i)] == 0)
				{
					numOfDifferences+=1;
				}
				if (numOfDifferences > 1)
				{
					return false;
				}
			}
			
			return true;
		}
	}
	
	//  Helper method to compute absolute difference between two 
	//  numbers
	public static int absDiff(int i, int j)
	{
		return Math.abs(i - j);
	}
	
	public static void main(String[] args)
	{
		System.out.println(oneAway("pale", "ple"));
		System.out.println(oneAway("pales", "pale"));
		System.out.println(oneAway("pale", "bale"));
		System.out.println(oneAway("bale", "bake"));
	}

}
