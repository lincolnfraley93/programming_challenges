/**
 * Question 2.7, Cracking the Coding Interview
 * Given two singly linked lists, determine if the two lists intersect.
 * Return the intersecting node.
 * 
 * @author Lincoln Fraley
 * January 1, 2016
 */
import java.util.Stack;

public class Intersection 
{
	public static Node intersect(Node node1, Node node2)
	{
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();
		
		Node traversalNode = node1;
		
		while (traversalNode != null)
		{
			stack1.push(traversalNode);
			traversalNode = traversalNode.next;
		}
		
		traversalNode = node2;
		while (traversalNode != null)
		{
			stack2.push(traversalNode);
			traversalNode = traversalNode.next;
		}
		
		Node intersectionNode = null;
		while (stack1.peek() == stack2.peek())
		{
			intersectionNode = stack1.pop();
			stack2.pop();
		}
		
		return intersectionNode;
	}
	
	public static void main(String[] args) 
	{
		

	}

}
