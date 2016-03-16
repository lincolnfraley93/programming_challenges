/**
 * 
 * @author Lincoln Fraley
 *
 */
public class SumLists 
{
	public static int sumLists(Node node1, Node node2)
	{
		int sum = 0;
		
		int powerOfTen = 0;
		
		Node traversalNode = node1;
		while (traversalNode != null)
		{
			sum+=traversalNode.getData() * Math.pow(10, powerOfTen);
			powerOfTen+=1;
			
			traversalNode = traversalNode.next;
		}
		
		powerOfTen = 0;
		traversalNode = node2;
		while (traversalNode != null)
		{
			sum+=traversalNode.getData() * Math.pow(10, powerOfTen);
			powerOfTen+=1;
			
			traversalNode = traversalNode.next;
		}
		
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Node node1 = new Node(7);
		node1.append(1);
		node1.append(6);
		
		Node node2 = new Node(5);
		node2.append(9);
		node2.append(2);
		
		System.out.println(sumLists(node1, node2));

	}

}
