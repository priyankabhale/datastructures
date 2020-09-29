package linkedlist;

public class LinkedListSingle {

	Node head;

	public LinkedListSingle() {
//		uncomment for insertItemAtLast
		head = new Node();
		head.value = 0;
		head.next = null;
	}

	void insertItemAtLast(int i) {
		Node newnode = new Node();
		newnode.value = i;
		newnode.next = null;

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode;
	}

	void insertItemAtBegin(int i) {
		// list is empty
		if (head == null) {
			head = new Node();
			head.value = i;
			head.next = null;
		} else {
			Node newNode = new Node();
			newNode.value = i;
			newNode.next = head;
			head = newNode;
		}
	}

	void delete(int i) {
		Node prev = null;
		Node temp = head.next;
		while (temp != null) {
			if (i == temp.value) {
				// first value
				if (prev == null) {
					head.next = temp.next;
				} else {
					prev.next = temp.next;
				}
			}
			prev = temp;
			temp = temp.next;
		}
	}

	void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

//	in descending
	void sortList() {
		int val;
		Node temp = head;
		while (temp != null) {
			Node tempInner = temp.next;
			while (tempInner != null) {
				if (temp.value < tempInner.value) {
					val = temp.value;
					temp.value = tempInner.value;
					tempInner.value = val;
				}
				tempInner = tempInner.next;
			}
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedListSingle single = new LinkedListSingle();
		single.insertItemAtBegin(2);
		single.insertItemAtBegin(9);
		single.insertItemAtBegin(0);
		single.insertItemAtBegin(6);
		single.print();
		System.out.println(" ======= ");

		single.sortList();
		single.print();
	}

	class Node {
		int value;
		Node next;
	}
}
