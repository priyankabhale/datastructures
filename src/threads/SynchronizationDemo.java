package threads;

public class SynchronizationDemo {
	
	public static void main(String[] args) {
		Display d1 = new Display();
		MyThread mt1 = new MyThread(d1, "kani");
		Thread t1 = new Thread(mt1);
		
//		Display d2 = new Display();
		MyThread mt2 = new MyThread(d1, "mani");
		Thread t2 = new Thread(mt2);
		
		t1.start();
		t2.start();
	}

}
