/**
 * Basic node class code from 'Cracking the Coding Interview'
 * Used to implement a linked list
 * 
 * @author Lincoln Fraley
 * December 31, 2015
 */
public class Node
{
	Node next = null;
	int data;
	
	public Node()
	{

	}
	
	public Node(int d)
	{
		data = d;
	}
	
	public void append(int d)
	{
		Node end = new Node(d);
		Node n = this;
		while (n.next != null)
		{
			n = n.next;
		}
		n.next = end;
	}
	
	public int getData()
	{
		return data;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	/** Prints list where 'node' is the head of this list */
	public void printList()
	{
		Node traversalNode = this;
		while (traversalNode != null)
		{
			System.out.print(traversalNode.getData() + ",");
			traversalNode = traversalNode.next;
		}
	}
}
