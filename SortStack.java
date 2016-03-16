/**
 * Question 3.5, Cracking the Coding Interview
 * Write a program to sort a stack such that the smallest items are 
 * on top.
 * 
 * @author Lincoln Fraley
 * January 2, 2016
 */

public class SortStack
{
	public static MyStack sortStack(MyStack unsortedStack)
	{
		//  Initialize sorted stack, declare variable to hold 
		//  current item being sorted
		MyStack sortedStack = new MyStack();
		int current;
		
		//  Used to keep reference to number of pops performed during
		//  sorting
		int counter;
		
		//  Iterate through entire unsorted stack
		while (!unsortedStack.isEmpty())
		{
			//  Add first item to sorted stack
			if (sortedStack.isEmpty())
			{
				sortedStack.push(unsortedStack.pop());
			}
			else
			{
				//  Current item being sorted
				current = unsortedStack.pop();
				
				//  Add current if less than top of sorted stack
				if (sortedStack.peek() > current)
				{
					sortedStack.push(current);
				}
				
				else
				{
					//  Set counter to 0, pop elements from sorted
					//  stack until an element greater than current 
					//  is encountered; increment counter for each
					//  pop
					counter = 0;
					while (sortedStack.peek() <= current)
					{
						unsortedStack.push(sortedStack.pop());
						counter++;
					}
					
					//  Add current to sorted stack, push the counter
					//  number of elements on top of unsorted stack 
					//  back on to sorted stack
					sortedStack.push(current);
					while (counter >= 0)
					{
						sortedStack.push(unsortedStack.pop());
						counter--;
					}
				}
				
			}
		}
		return sortedStack;
	}
	public static void main(String[] args) 
	{
		MyStack unsortedStack = new MyStack();
		
		for (int i = 1; i <= 10; i++)
		{
			unsortedStack.push(i);
		}
		
		unsortedStack.printStack();
		
		unsortedStack = sortStack(unsortedStack);
		unsortedStack.printStack();
		System.out.println(unsortedStack.pop());
	}

}
