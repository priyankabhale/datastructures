package threads;

public class MyThread implements Runnable {

	Display d;
	String name;

	MyThread() {

	}

	MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.sycn(name);
		d.statSynch1(name);
		d.statSynch2(name);
		d.stat(name);
		d.normal(name);
	}

}
