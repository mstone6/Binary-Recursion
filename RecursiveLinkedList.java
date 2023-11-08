package Week6;

/**
 * @author Mushka Stone
 * Recursive Binary 
 * 11/7/2023
 * 
 * Question 1: Create a Linked List and Implement a Recursive Search
 * Create a singly linked list of integers. 
 * Write a recursive function to search for a specific value within the linked list. 
 * The function should return `true` if the value is found in the list and `false` otherwise.
**/


public class RecursiveLinkedList {
	//Lets make a Linked list
	
	static Node head; //This is the head node and tail node
	Node tail;
	int curSize; //This is the size of the list
	
	public RecursiveLinkedList(){
		head = null; //head node equals null
		curSize = 0; //current size equals null
	}
	
	//Lets create our nodes
	class Node<E>{
		Node next; 
		E data;
		
		public Node(E data) {
			this.next = null;
			this.data = data;
		}
	}
	
	//Lets add to our linked list
	public <E> void add(E data) {
		Node newNode = new Node(data);
		newNode.next = (RecursiveLinkedList.Node)head;
		head = (RecursiveLinkedList.Node)newNode;
		
		if(curSize == 0) {
			tail = newNode;
		}
		curSize++;
		}
		
	
	//Lets make a toString to display the list
	public String toString(Boolean exists, int x) {
		System.out.println("The value " + x + " is found: " + exists);
		return "";
	}
	
	public <E> boolean searchForValue(E data) {
		return searchForValue(data,head);
	}
	
	//Lets make the search method
	public <E> boolean searchForValue(E data, Node<E> current) {
		if(current == null) {
			//If the value is not found and the end of the list is reached
			//this is base case
			return false;
		}else if(current.data.equals(data)) {
			//If the value is found
			return true;
		}else {
			//Start the recursion search
			return searchForValue(data, current.next); // keep searching if not found
		}
	}
	
	public static void main(String[]args) {
		//Lets create a linkedlist!
		RecursiveLinkedList linky = new RecursiveLinkedList();
		
		linky.add(1);
		linky.add(2);
		linky.add(3);
		linky.add(4);
		linky.add(5);
		
		int x = 1;
		boolean exists = linky.searchForValue(x, head);
		
		linky.toString(exists, x);
	}
}

