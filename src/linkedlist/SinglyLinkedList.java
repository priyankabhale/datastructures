package linkedlist;

public class SinglyLinkedList {
	private Node head;

	public SinglyLinkedList() {
		head = new Node();
		head.value = 0;
		head.next = null;
	}

	public boolean insertItem(int item) {
		Node node = new Node();
		node.value = item;
		
//		inserts it at the begining of the node
//		node.next = head;
//		head = node;
		
//		inserts it at the end of the node
		node.next = null;
		Node last_node = head;
		while(last_node.next != null) {
			last_node = last_node.next;
		}
		last_node.next = node;
		return true;
	}

	private boolean delete(int item) {
		if (head.next.value == item) {
			head.next = head.next.next;
			return true;
		} else {
			Node x = head;
			Node y = head.next;
			while (true) {
				if (y == null || y.value == item) {
					break;
				} else {
					x = y;
					y = y.next;
				}
			}
			if (y != null) {
				x.next = y.next;
				return true;
			} else {
				return false;
			}
		}
	}

	public void print() {
		Node node = head.next;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}

	public class Node {
		private int value;
		private Node next;
	}

	public static void main(String[] args) {
		SinglyLinkedList s = new SinglyLinkedList();
		s.insertItem(2);
		s.insertItem(5);
		s.insertItem(8);
		s.print();
		System.out.println(" ===  ");
//		s.delete(5);
//		s.print();
	}
}
