package linkedlist;

public class ReverseLinkList {
	
	public static void main(String[] args) {
		LinkedListSingle list = new LinkedListSingle();
		list.insertItemAtLast(2);
		list.insertItemAtLast(3);
		list.insertItemAtLast(4);
		list.insertItemAtLast(5);
		list.insertItemAtLast(6);
//		list.print();
		
		LinkedListSingle.Node curr = list.head;
		LinkedListSingle.Node prev = null;
		LinkedListSingle.Node next = null;
		while(curr !=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		while(prev!=null) {
			System.out.println(prev.value);
			prev = prev.next;
		}
	}

}
