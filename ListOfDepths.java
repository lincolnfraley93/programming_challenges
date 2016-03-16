/**
 * Question 4.3, Cracking the Coding Interview
 * Given a binary tree, design an algorithm which creates a linked
 * list of all the nodes at each depth.
 * 
 * @author Lincoln Fraley
 * January 2, 2016
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepths 
{
	public static ArrayList<LinkedList> listOfDepths(BinaryNode root)
	{
		GenericQueue<BinaryNode> queue = new GenericQueue<BinaryNode>();
		ArrayList<LinkedList> arrayList = new ArrayList<LinkedList>();
		int counter = 1;
		
		queue.add(root);
		
		while (!queue.isEmpty())
		{
			LinkedList<BinaryNode> list = new LinkedList<BinaryNode>();
			BinaryNode current;
			
			for (int i = 0; i < counter; i++)
			{
				current = queue.remove();
				list.add(current);
				
				if (current.left == null && current.right == null)
				{
					
				}
				else
				{
					if (current.left == null)
					{
						queue.add(current.right);
					}
					else if (current.right == null)
					{
						queue.add(current.left);
					}
					else
					{
						queue.add(current.left);
						queue.add(current.right);
					}
				}
					
			}
			
			arrayList.add(list);
			counter = (counter * 2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
