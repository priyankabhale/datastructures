package threads;

public class Display {

	// object level lock
	public synchronized void sycn(String name) {

		for (int i = 0; i < 5; i++) {
			System.out.print("Good morning synch : ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}

	}

	// class level lock
	public static synchronized void statSynch1(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Good morning static synch1: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}

	// class level lock
	public static synchronized void statSynch2(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Good morning static synch2: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
	
	// no lock
	public static void stat(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Good morning static: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
	
	//no lock
	public void normal(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Good morning normal: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
