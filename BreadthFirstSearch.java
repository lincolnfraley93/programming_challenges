/**
 * Breadth-first search method
 * 
 * @author Lincoln Fraley
 * January 2, 2016
 */
public class BreadthFirstSearch 
{
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
				System.out.println(currentNode.data + ",");
				
				if (currentNode.left == null)
				{
					queue.add(currentNode.right);
				}
				if (currentNode.right == null)
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
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
