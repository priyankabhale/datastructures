package queue;

public class Queue {

	private int front;
	private int rear;
	private long[] arr;

	public Queue(int size) {
		arr = new long[size];
		front = 0;
		rear = 0;
	}

	public void enqueue(int elem) {
		if(rear == arr.length) {
			System.out.println("Queue Full");
		}else {
			arr[rear] = elem;
			rear++;
		}
	}

	public void dequeue() {
		if(front == rear) {
			System.out.println("Queue Empty");
		}else {
			long val = arr[front];
			front++;
		}
	}

	public long front() {
		return arr[front];
	}

	public void display() {
		for (int i = front; i < rear; i++) {
			System.out.printf(" %d <-- ", arr[i]);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Queue q = new Queue(3);
		q.enqueue(2);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(8);
		q.display();
		
		q.dequeue();
		q.display();//4,6
		
		q.dequeue();
		q.display();//6
		
		q.dequeue();
		q.display();//
		
		q.dequeue();
		q.display();
	}

}
