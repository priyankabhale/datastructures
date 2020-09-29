import java.util.ArrayList;
import java.util.List;

public class ConsumerDemo implements Runnable {

	private List<Integer> list = new ArrayList<>();

	public ConsumerDemo(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		synchronized (list) {
			while(true) {
				while (list.isEmpty()) {
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Consumer: " + list.get(0));
				list.remove(0);
				list.notifyAll();
			}
		}
	}

}
