package threadsImpl;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	List<Integer> integers = new ArrayList<Integer>();

	public List<Integer> getIntegers() {
		return integers;
	}

	public void setIntegers(List<Integer> integers) {
		this.integers = integers;
	}

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		Producer prod = new Producer(counter.getIntegers());
		Thread p = new Thread(prod);

		Consumer cons = new Consumer(counter.getIntegers());
		Thread c = new Thread(cons);

		p.start();
//		p.join();
		c.start();

//		c.join();
	}

}
