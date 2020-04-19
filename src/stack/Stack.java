package stack;

public class Stack {

	private long[] arr;
	private int top; // starts from 0
	private int maxSize; // starts from 1

	public Stack(int size) {
		this.maxSize = size;
		arr = new long[maxSize];
		top = -1;
	}

	public void push(int elem) {
		if (isFull()) {
			System.out.println("Array full");
//			top = -1;
		} else {
			top++;
			arr[top] = elem;
		}

	}

	public long pop() {
		if (isEmpty()) {
			System.out.println("array empty");
			return -1;
		} else {
			maxSize--;
			long val = arr[top];
			top--;
			return val;
		}
	}

	public void print() {
		for (int i = (maxSize - 1); i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public long peek() {
		if(top >= 0)
			return arr[top];
		else
			return 0;
	}

	public boolean isEmpty() {
		return (top < 0);
	}

	public boolean isFull() {
		return (top >= (maxSize - 1));
	}

	public static void main(String[] args) {
		Stack stack = new Stack(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("after push =====================");
		stack.print();

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println("after pop =====================");
		stack.print();
	}

}
