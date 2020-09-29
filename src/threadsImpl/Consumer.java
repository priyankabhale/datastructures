package threadsImpl;

import java.util.List;

public class Consumer implements Runnable {

	int count = 1;
	List<Integer> integers = null;

	public Consumer(List<Integer> integers) {
		this.integers = integers;
	}

	@Override
	public void run() {
		try {
			synchronized (integers) {
				while (count < 11) {
					while (integers.size() == 0) {
						integers.wait();
					}
					System.out.println("In Consumer removed " + integers.get(integers.size() - 1));
					integers.remove(integers.size() - 1);
					integers.notify();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
