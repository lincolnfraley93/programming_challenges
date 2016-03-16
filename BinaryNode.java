/**
 * Basic implementation of a node for a binary tree
 * 
 * @author Lincoln Fraley
 * January 2, 2016
 */
public class BinaryNode<T>
{
	T 		data;
	BinaryNode 	left;
	BinaryNode 	right;
	
	public BinaryNode()
	{
		
	}
	
	public BinaryNode(T data)
	{
		this.data = data;
	}
}
