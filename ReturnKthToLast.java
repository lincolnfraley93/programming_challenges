/**
 * Question 2.2, Cracking the Coding Interview
 * Return the kth to last element in a linked list
 * 
 * @author Lincoln Fraley
 * December 31, 2015
 */
public class ReturnKthToLast 
{
	public static int returnKthToLast(Node node, int k)
	{
		Stack stack = new Stack();
		
		//  Create traversal node
		Node traversalNode = node;
		
		//  Add each element in list to stack
		while (traversalNode != null)
		{
			stack.push(traversalNode.getData());
			traversalNode = traversalNode.next;
		}
		
		//  Pop off (k - 1) elements from the stack
		for (int i = 1; i < k; i++)
		{
			stack.pop();
		}
		
		return stack.pop();
	}
	
	public static void main(String[] args) 
	{
		Node node = new Node(1);
		node.append(2);
		node.append(3);
		node.append(4);
		System.out.println(returnKthToLast(node, 2));
	}

}
