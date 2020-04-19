package HashTable;

import linkedlist.SinglyLinkedList.Node;

public class StdList {
	Node head;

	public StdList() {
	}

	void insertItem(Student s) {
		if (head == null) {
			head = new Node();
			head.student = s;
		} else {
			Node n = new Node();
			n.student = s;
			Node t = head;
			while (t.next != null) {
				t = t.next;
			}
			t.next = n;
		}
	}

	boolean haveRollNo(int r) {
		Node t = head;
		boolean have = false;
		while (t != null) {
			if (r == t.student.roll_no)
				have = true;
			t = t.next;
		}
		return have;
	}

	Student findItem(int r) {
		Node t = head;
		Student s = null;
		while (t != null) {
			if (r == t.student.roll_no)
				s = t.student;
			t = t.next;
		}
		return s;
	}

	boolean deleteItem(int r) {
		Node p = head;
		Node q = head.next;
		while (q != null && q.student.roll_no != r) {
			p = q;
			q = q.next;
		}
		if (q != null)
			p.next = q.next;
		return true;
	}

	void showItem() {
		Node t = head;
		while (t != null) {
			System.out.println(t.student.toString());
			t = t.next;
		}
	}

	class Node {
		Student student;
		Node next;
	}
}
