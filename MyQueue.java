
/**
 * Basic queue class
 * 
 * @author Lincoln Fraley
 * January 2, 2016
 */
public class MyQueue 
{
	private static class QueueNode
	{
		private int data;
		private QueueNode next;
		
		public QueueNode()
		{
			
		}
		public QueueNode(int data)
		{
			this.data = data;
		}
	}
	
	private QueueNode head;
	private QueueNode tail;
	
	public MyQueue()
	{
		
	}
	
	public MyQueue(int data)
	{
		head = new QueueNode(data);
		tail = head;
	}
	
	public void enqueue(int data)
	{
		if (head == null)
		{
			head = new QueueNode(data);
			tail = head;
		}
		else
		{
			QueueNode newNode 	= new QueueNode(data);
			tail.next 			= newNode;
			tail 				= newNode;
		}
	}
	
	public Integer dequeue()
	{
		if (head == null)
		{
			return null;
		}
		else
		{
			int data 	= head.data;
			head 		= head.next;
			return data;
		}
	}
	
	public boolean isEmpty()
	{
		if (head == null)
		{
			return true;
		}
		
		return false;
	}
	
	public Integer peek()
	{
		if (head == null)
		{
			return null;
		}
		else
		{
			return head.data;
		}
	}
	
	public static void main(String[] args) 
	{
		//  Dequeue null queue
		MyQueue queue = new MyQueue();
		System.out.println(queue.dequeue());
		
		//  Enqueue, then dequeue
		queue.enqueue(1);
		System.out.println(queue.dequeue());
		
		//  Test 'isEmpty()' on empty queue
		System.out.println(queue.dequeue());
		System.out.println(queue.isEmpty());
		
		//  Test 'isEmpty()' on non-empty queue
		queue.enqueue(1);
		System.out.println(queue.isEmpty());
		
		for (int i = 0; i < 5; i ++)
		{
			queue.enqueue(i);
		}
		
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
	}

}
