/**
 * Question 2.4, Cracking the Coding Interview
 * Partition a linked list around a value x, such that all nodes
 * less than x come before all nodes greater than or equal to x.
 * 
 * @author Lincoln Fraley
 * December 31, 2015
 */
public class LinkedListPartition 
{
	public static Node partition(Node node, int partition)
	{
		//  Create new linked list, and traversal node pointing to
		//  last node in list smaller than partition
		Node head;
		Node smallerNode = null;
		head = smallerNode;
	}
	
	public static void main(String[] args) 
	{
		Node node = new Node(3);
		node.append(5);
		node.append(8);
		node.append(5);
		node.append(10);
		node.append(2);
		node.append(1);
		
		node.printList();
		
		node = partition(node, 5);
		node.printList();

	}

}
