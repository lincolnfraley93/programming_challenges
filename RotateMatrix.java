/**
 * Question 1.7, Cracking the Coding Interview
 * Given an image represented by an NxN matrix, write a method to 
 * rotate the image by 90 degrees.
 * 
 * @author Lincoln Fraley
 * December 31, 2015
 */

public class RotateMatrix 
{
	public static int[][] rotateMatrix(int[][] matrix)
	{
		//  Declare variable used for temporary storage
		int temp;
		System.out.println(matrix.length);
		
		//  Perform a transposition on the matrix
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = i+ 1; j < matrix.length; j++)
			{
				temp 			= matrix[j][i];
				matrix[j][i] 	= matrix[i][j];
				matrix[i][j] 	= temp;
			}
		}
		
		return matrix;
	}
	
	public static void main(String[] args) 
	{
		int[][] array = { {1,2, 3},{4, 5, 6}, {7, 8, 9} };
		
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length; j++)
			{
				System.out.print(array[i][j] + ",");
			}
			System.out.println();
		}
		
		array = rotateMatrix(array);
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length; j++)
			{
				System.out.print(array[i][j] + ",");
			}
			System.out.println();
		}
		
	}

}
