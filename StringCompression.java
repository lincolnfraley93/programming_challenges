/**
 * Question 1.6, 'Cracking the Coding Interview'
 * Implement a method to perform basic string compression using the
 * counts of repeated characters. If the 'compressed' string would 
 * not become smaller than the original string, the method should
 * return the original string.
 * 
 * @author Lincoln Fraley
 * December 31, 2015
 */

import java.util.*;

public class StringCompression 
{
	public static String stringCompression(String string)
	{
		//  References for current char in string, as well as its
		//  number of counts; initialize currentChar to first char 
		//  in string and count to 1, respectively
		char currentChar 	= string.charAt(0);
		int count 			= 1;
		
		//  Use StringBuilder object for more efficient string 
		//  building
		StringBuilder stringBuilder = 
				new StringBuilder();
		
		for (int i = 1; i < string.length(); i++)
		{
			//  Add to currentChar's count if it is equal to the
			//  current character being encountered in string
			if (string.charAt(i) == currentChar)
			{
				count+=1;
			}
			
			//  Else, append currentChar and its count to
			//  stringBuilder, then reset currentChar and count
			else
			{
				stringBuilder.append(currentChar);
				stringBuilder.append(count);
				
				currentChar = string.charAt(i);
				count 		= 1;
				System.out.println(currentChar);
			}
		}
		
		stringBuilder.append(currentChar);
		stringBuilder.append(count);
		
		String compressedString = stringBuilder.toString();
		
		if (compressedString.length() <= string.length())
		{
			return compressedString;
		}
		else
		{
			return string;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(stringCompression("ab"));

	}

}
