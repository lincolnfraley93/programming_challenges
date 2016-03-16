/**
 * Question 4.1, Cracking the Coding Interview
 * Given a directed graph, design an algorithm to find out whether
 * there is a route between two nodes.
 * 
 * @author Lincoln Fraley
 * January 2, 2016
 */

public class RouteBetweenNodes 
{
	public static boolean isRoute(boolean[][] matrix, int node1, int node2)
	{
		MyQueue queue = new MyQueue();
		queue.enqueue(node1);
		
		int currentNode;
		
		while (!queue.isEmpty())
		{
			currentNode = queue.peek();
			
			if (matrix[currentNode][node2])
			{
				return true;
			}
			else
			{
				for (int i = 0; i < matrix.length; i++)
				{
					if (matrix[currentNode][i])
					{
						queue.enqueue(i);
					}
				}
				
				queue.dequeue();
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) 
	{
		boolean[][] matrix = new boolean[4][4];
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix.length; j++)
			{
				matrix[i][j] = false;
			}
		}
		
		matrix[0][1] = true;
		matrix[1][2] = true;
		matrix[2][3] = true;
		
		
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix.length; j++)
			{
				System.out.print(matrix[i][j] + ",");
			}
			System.out.println();
		}
		
		System.out.println(isRoute(matrix, 0, 3));

	}

}
