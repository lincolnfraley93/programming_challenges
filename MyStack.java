/**
 * Basic stack class using code from 'Cracking the Coding Interview'
 * 
 * @author Lincoln Fraley
 * January 2, 2016
 */

public class MyStack 
{
	private static class StackNode
	{
		private int data;
		private StackNode next;
		
		public StackNode(int data)
		{
			this.data = data;
		}
	}
	
	private StackNode top;
	
	public Integer pop()
	{
		if (top == null)
		{
			return null;
		}
		
		int item 	= top.data;
		top 		= top.next;
		return item;
	}
	
	public void push(int data)
	{
		StackNode t = new StackNode(data);
		t.next 		= top;
		top 		= t;
	}
	
	public Integer peek()
	{
		if (top == null)
		{
			return null;
		}
		
		return top.data;
	}
	
	public boolean isEmpty()
	{
		if (top == null)
		{
			return true;
		}
		return false;
	}
	
	public void printStack()
	{
		while (this.top != null)
		{
			System.out.print(this.pop() + ",");
		}
	}
}
