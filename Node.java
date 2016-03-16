/**
 * Basic node class.
 * Used to implement a linked list.
 * 
 * @author Lincoln Fraley
 * December 31, 2015
 */
public class Node	{
		private Node next = null;
		private int data;
	
		public Node(int data) {
				this.data = data;
		}
	
		public void append(int data) {
				Node new_node = new Node(data);
				Node current = this;
				while (current.next!=null) {
						current = current.next;
				}
				current.next = new_node;
		}
	
		public int getData() {
				return data;
		}
	
		public void setData(int data) {
				this.data = data;
		}
		
		public Node getNext() {
				return next;
		}
		
		public void printList() {
				if (this==null) {
						System.out.println("Null list.");
				} else {
						Node traversalNode = this;
						while (traversalNode!=null) {
								if (traversalNode.next!=null) {
										System.out.print(traversalNode.getData() + "->");
								} else {
										System.out.println(traversalNode.getData());
								}
								traversalNode = traversalNode.next;
						}
				}
		}
}
