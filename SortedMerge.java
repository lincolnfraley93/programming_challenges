/**
 * NOT FINISHED
 * 
 * Question 10.1, Cracking the Coding Interview
 * Given two sorted arrays, A and B, where A has a large enough 
 * buffer at the end to hold B, merge A and B in sorted order
 * 
 * @author Lincoln Fraley
 * January 12, 2016
 */

public class SortedMerge 
{
	public static int[] sortedMerge(int[] A, int[] B)
	{
		//  References to position of current max in arrays A and B,
		//  respectively
		int indexA = (A.length - B.length) - 1;
		int indexB = (B.length - 1);
		
		for (int i = (A.length - 1); i >= 0; i--)
		{
		
			if (A[indexA] >= B[indexB])
			{
				A[i] = A[indexA];
				indexA--;
			}
			else
			{
				A[i] = B[indexB];
				indexB--;
			}
		}
		
		return A;
	}
	
	public static void main(String[] args) 
	{
		int[] notA = {1, 3, 5, 6, 7, };
		int[] B = {2, 4, 5};
		
		int[] A = new int[8];
		for (int i = 0; i < 5; i++)
		{
			A[i] = notA[i];
		}
		
		A = sortedMerge(A, B);
		
		PrintArray.printArray(A);

	}

}
