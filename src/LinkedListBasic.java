
public class LinkedListBasic {
	Node head;
	/*
	 * Utility function to insert a node at the beginning
	 */
	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	/* Utility function for displaying linked list */
	void printList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println("");
	}

	/*
	 * Utility function for calculating length of linked list
	 */
	int countNodes() {
		int count = 0;
		Node s = head;
		while (s != null) {
			count++;
			s = s.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		// insert at the begin of list
		/*
		 * Node headEnd = null; for(int i=1; i<11; i++) { Node n = new Node(i); n.next =
		 * headEnd; headEnd = n; }
		 * 
		 * Node node = headEnd; while(node != null) { System.out.println(node.data);
		 * node = node.next; }
		 */
		
//		System.out.println("======================================");
		
		// insert at the end of the list
		Node head = null;
		Node tail = null;
		int size=0;
		for(int i=1; i<11; i++) {
			Node n = new Node(i);
			if(head == null && tail==null) {
				head = n;
				tail = n;
			}else {
				tail.next = n;
				tail = n;
			}
			size++;
		}
		Node node = head;
		int i =1;
		int k = 3;
		int r = size - 3;
		Node first=null; Node last=null;
		Node prevfirst=null; Node prevlast=null;
		
		while(node != null) {
			if(i == k-1) {
				prevfirst = node;
			}else if(i==k) {
				first = node;
			}else if(i== r-1) {
				prevlast = node;
			}else if(i==r) {
				last = node;
			}
			node = node.next;
			i++;
		}
		
		first.data = last.data;
		
		
	}
}

class Node {
	int data;
	Node next;
	
	Node(){}

	Node(int d) {
		data = d;
		next = null;
	}
}
