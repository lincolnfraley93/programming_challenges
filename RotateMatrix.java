/**
 * Given an image represented by an nxn matrix, write a method to 
 * rotate the image by 90 degrees.
 * 
 * @author Lincoln Fraley
 * December 31, 2015
 */

public class RotateMatrix {
		public static void rotateMatrix(int[][] matrix) {		
				int temp;
				for (int i = 0; i < matrix.length; i++) {
						for (int j = i+ 1; j < matrix.length; j++) {
								temp = matrix[j][i];
								matrix[j][i] = matrix[i][j];
								matrix[i][j] = temp;
						}
				}
		}
	
		public static void main(String[] args) {
				int[][] array = { {1,2, 3},{4, 5, 6}, {7, 8, 9} };
				for (int i = 0; i < array.length; i++) {
						for (int j = 0; j < array.length; j++) {
								System.out.print(array[i][j] + ",");
						}
						System.out.println();
				}
				System.out.println();
				rotateMatrix(array);
				for (int i = 0; i < array.length; i++) {
						for (int j = 0; j < array.length; j++) {
								System.out.print(array[i][j] + ",");
						}
						System.out.println();
				}
		}
}
