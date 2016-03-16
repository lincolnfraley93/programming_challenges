/**
 * Question 3.2, Cracking the Coding Interview
 * Design a stack which, in addition to push and pop, has a function
 * 'min' which returns the minimum element.
 * Uses basic stack class from 'Cracking the Coding Interview' 
 * implemented as a doubly linked list.
 * 
 * @author Lincoln Fraley
 * January 1, 2016
 * @param <T>
 */
public class StackMin<T extends Comparable<T>> 
{
	/** Inner node class */
	private static class StackNode<T>
	{
		private T data;
		private StackNode<T> next;
		private StackNode<T> previous;
		
		public StackNode()
		{
			
		}
		
		public StackNode(T data)
		{
			this.data = data;
		}
	}
	
	private StackNode<T> 	head;
	private T 				min;
	private StackNode<T>	minNode;
	
	public StackMin()
	{
		head 	= new StackNode();
		minNode = head;
	}
	
	public StackMin(T data)
	{
		head 	= new StackNode(data);
		minNode = head;
		min 	= data;
	}
	
	public T pop()
	{
		if (head == null)
		{
			return null;
		}
		
		T data 	= head.data;
		head 	= head.next;
		return data;
	}
	
	public void push(T data)
	{
		StackNode<T> node 	= new StackNode<T>(data);
		head.previous 		= node;
		node.next 			= head;
		head 				= node;
		
		if (min.compareTo(data) > 0)
		{
			min 	= data;
			minNode = node;
		}
	}
	
	public T peek()
	{
		if (head == null)
		{
			return null;
		}
		return head.data;
	}
	
	public T min()
	{
		if (minNode == head)
		{
			head = head.next;
			return minNode.data;
		}
		else
		{
			minNode.previous.next = minNode.next;
			return minNode.data;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
