/**
 * Question 2.1, Cracking the Coding Interview
 * Remove duplicates from an unsorted linked list.
 * 
 * @author Lincoln Fraley
 * December 31, 2015
 */

import java.util.HashSet;

public class RemoveDups 
{
	public static Node removeDuplicatesWithBuffer(Node node)
	{
		//  Create BitSet for unique elements
		HashSet<Integer> set = new HashSet<Integer>();
		
		//  Node set to head node of linked list, used to traverse
		//  the list and variable used to get Node data
		Node traversalNode = node;
		
		while (traversalNode != null)
		{
			//  Add data at current node
			set.add(traversalNode.getData());
			
			if (set.contains(traversalNode.next.getData()))
			{
				traversalNode.next = traversalNode.next.next;
			}
			
			traversalNode = traversalNode.next;
		}
		
		return node;
	}
	
	public static void main(String[] args) 
	{
		Node node = new Node(1);
		node.append(2);
		node.append(1);
		node.append(2);
		node.append(3);
		node.printList(); 
		System.out.println();
		
		node = removeDuplicatesWithBuffer(node);
		node.printList();
	}

}
