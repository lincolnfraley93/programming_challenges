/**
 * Return the kth to last element in a linked list, where k = 0 would
 * be last element of list.
 * Uses Node class to implement the list.
 * 
 * @author Lincoln Fraley
 * December 31, 2015
 */
public class ReturnKthToLast {
		public static int returnKthToLast(Node head, int k) {
				System.out.println(k);
				Node current = head;
				while (k>=0) {
						current = current.getNext();
						if (current==null) {
								System.out.format("List contains less than %d elements.%n", k);
								System.exit(0);
						}
						k--;
				}
				Node kth_to_last = head;
				while (current!=null) {
						current = current.getNext();
						kth_to_last = kth_to_last.getNext();
				}
				return kth_to_last.getData();
		}
	
	public static void main(String[] args) 
	{
			Node linked_list = new Node(1);
			for (int i=2; i<=5; i++) {
					linked_list.append(i);
			}
			System.out.println("Full list:");
			linked_list.printList();
			System.out.format("2nd to last element: %d%n", returnKthToLast(linked_list, 6));
	}

}
