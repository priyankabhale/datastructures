import java.util.ArrayList;
import java.util.List;

public class ProducerDemo implements Runnable {
	int count = 10;

	private List<Integer> list = new ArrayList<>();

	public ProducerDemo(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		synchronized (list) {
			while(count>0) {
				count --;
				while (list.size() == 1) {
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int val = 2;
				System.out.println("Producer: " + val);
				list.add(val);
				list.notifyAll();
			}
		}
	}

}
