/**
 * Question 5.1, Cracking the Coding Interview
 * You are given two 32-bit numbers, M and N, and two bit positions,
 * i and j. Write a method to insert M into N such that M starts at
 * bit j and ends at bit i.
 *
 * @author Lincoln Fraley
 * Jan 15, 2016
 */

public class BitInsertion 
{
	public static long insertion(long M, long N, int i, int j)
	{
		String stringM = Long.toString(M);
		String stringN = Long.toString(N);
		
		long binaryM = Long.parseLong(stringM,2);
		long binaryN = Long.parseLong(stringN,2);
		
		binaryM = binaryM << i;
		
		long result = binaryM ^ binaryN;
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		long M = 10011;
		long N = 1 << 10;
		int i = 2;
		int j = 6;
		
		long result = insertion(M,N,i,j);
		System.out.println(Long.toBinaryString(result));
	}

}
