/**
 * Question 4.2, Cracking the Coding Interview
 * Given an array of increasing, unique, integer elements, create
 * a binary search tree with minimal height.
 * 
 * @author Lincoln Fraley
 * January 2, 2016
 */
public class MinBinarySearchTree 
{
	public static BinaryNode minTree(int[] array)
	{
		return minTree(array, 0, (array.length - 1));
	}
	
	private static BinaryNode minTree(int[] array, int start, int end)
	{
		if (end < start)
		{
			return null;
		}
		else
		{
			int middle 				= (start + end) / 2;
			
			BinaryNode parentNode 	= new BinaryNode(array[middle]);
			parentNode.left 		= minTree(array, start, (middle - 1));
			parentNode.right 		= minTree(array, (middle + 1), end);
			return parentNode;
		}
	}
	
	public static void main(String[] args) 
	{
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		BinaryNode minTree = minTree(array);
		BFS(minTree);
	}

	public static void BFS(BinaryNode root)
	{
		if (root == null)
		{
			System.out.println("Empty tree.");
		}
		else
		{
			GenericQueue<BinaryNode> queue = new GenericQueue<BinaryNode>();
			queue.add(root);
			
			while(!queue.isEmpty())
			{
				BinaryNode currentNode = queue.remove();
				
				if (currentNode == null)
				{
					
				}
				else
				{
					System.out.println(currentNode.data + ",");
					
					if (currentNode.left == null)
					{
						queue.add(currentNode.right);
					}
					else if (currentNode.right == null)
					{
						queue.add(currentNode.left);
					}
					else
					{
						queue.add(currentNode.left);
						queue.add(currentNode.right);
					}
				}
				
			}
		}
			
	}

}
