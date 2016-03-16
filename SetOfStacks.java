/**
 * Question 3.3, Cracking the Coding Interview
 * Implement a class that uses a set of stacks. A new stack is created
 * once the current stack reaches capacity.
 * 
 * @author Lincoln Fraley
 * January 1, 2016
 */
import java.util.ArrayList;

public class SetOfStacks
{
	private Node 			currentStack;
	private int 			sizeOfCurrentStack = 0;
	private ArrayList<Node> setOfStacks;
	private final int 		CAPACITY = 10;
	
	public SetOfStacks()
	{
		currentStack 	= new Node();
		setOfStacks.add(currentStack);
	}
	
	public SetOfStacks(int data)
	{
		currentStack = new Node(data);
		setOfStacks.add(currentStack);
		sizeOfCurrentStack+=1;
	}
	
	public void push(int data)
	{
		if (sizeOfCurrentStack >= CAPACITY)
		{
			currentStack = new Node(data);
			setOfStacks.add(currentStack);
			sizeOfCurrentStack = 1;
		}
		else
		{
			currentStack.
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
