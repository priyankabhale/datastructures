package threadsImpl;

import java.util.List;

public class Producer implements Runnable {

	int count = 1;
	List<Integer> integers = null;

	public Producer(List<Integer> integers) {
		this.integers = integers;
	}

	@Override
	public void run() {
		synchronized (integers) {
			while (count < 11) {
				try {
					while (integers.size() == 1)
						integers.wait();

					integers.add(count);
					System.out.println("In Producer added " + integers.get(integers.size() - 1));
					integers.notify();
					count++;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
