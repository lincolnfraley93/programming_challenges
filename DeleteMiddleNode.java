/**
 * Question 2.3, Cracking the Coding Interview
 * Implement an algorithm to delete a node in the middle of a singly
 * linked list, given only access to that node.
 * 
 * @author Lincoln Fraley
 * December 27, 2015
 */

public class DeleteMiddleNode 
{
	public static void deleteMiddleNode(Node node)
	{
		//  Set current node's data to the next node's data
		while (node.next != null)
		{
			node.data = node.next.getData();
			node = node.next;
		}
		
		//  Set the final node to null
		node = null;
	}
	
	public static void main (String[] args)
	{
		Node node = new Node(1);
		node.append(2);
		node.append(3);
		node.append(4);
		node.append(5);
		
		Node middleNode = node;
		while (middleNode.getData() != 3)
		{
			middleNode = middleNode.next;
		}
		
	}
}





