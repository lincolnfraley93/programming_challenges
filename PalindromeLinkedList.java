/**
 * Question 2.6, Cracking the Coding Interview
 * Implement an algorithm to check if a linked list is a palindrome
 * 
 * @author Lincoln Fraley
 * December 31, 2015
 */
import java.util.ArrayList;

public class PalindromeLinkedList 
{
	public static boolean isPalindrome(Node node)
	{
		//  Create arraylist to hold linked list elements
		ArrayList arrayList = new ArrayList();
		
		//  Traverse list and add elements to arraylist
		Node traversalNode = node;
		while (traversalNode != null)
		{
			arrayList.add(traversalNode.getData());
			traversalNode = traversalNode.next;
		}
		
		//  Create iterators for front and end of arraylist, compare
		//  elements until they reach the middle; return false if the
		//  elements aren't the same
		int i = 0;
		int j = (arrayList.size() - 1);
		while (i < j)
		{
			if (arrayList.get(i) != arrayList.get(j))
			{
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) 
	{
		Node node = new Node(1);
		
		
		System.out.println(isPalindrome(node));

	}

}
