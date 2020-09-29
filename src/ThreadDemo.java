
public class ThreadDemo{
	
	public static void main(String[] args) {
		try {
			
			Thread t = new Thread(() -> {
				for(int i=0; i<10000;i++) {
					System.out.println(i+" Thread running....");
				}
			});
			t.start();
			t.stop();
			t.start();
//			t.interrupt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
