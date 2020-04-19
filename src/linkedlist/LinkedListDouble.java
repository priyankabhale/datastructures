package linkedlist;

public class LinkedListDouble {

	Node head = null;
	Node last = null;

	public LinkedListDouble() {

	}

	void insertItem(int i) {
		// first element
		if (head == null) {
			head = new Node();
			head.value = i;
			head.prevNode = null;
			head.nextNode = null;
			last = head;
		} else {
			Node newNode = new Node();
			newNode.value = i;
			newNode.prevNode = last;
			last.nextNode = newNode;
			last = newNode;
		}
	}

	void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.nextNode;
		}
	}

	void deleteItem(int i) {
		Node temp = head;
		while (temp != null) {
			if (temp.value == i) {
				Node prev = temp.prevNode;
				Node next = temp.nextNode;
				prev.nextNode = next;
				next.prevNode = prev;
				break;
			}
			temp = temp.nextNode;
		}
	}

	public static void main(String[] args) {
		LinkedListDouble doubleListDouble = new LinkedListDouble();
		doubleListDouble.insertItem(8);
		doubleListDouble.insertItem(3);
		doubleListDouble.insertItem(7);
		doubleListDouble.insertItem(4);
		doubleListDouble.print();

		System.out.println("After delete");

		doubleListDouble.deleteItem(7);
		doubleListDouble.print();
	}

	class Node {
		Node prevNode;
		int value;
		Node nextNode;
	}

}
