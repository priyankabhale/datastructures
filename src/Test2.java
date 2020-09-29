import java.util.Vector;

class Ex0 extends Vector {
	int i = 1;
	public Ex0(){
		i =2;
	}
}

class Ex1 extends Ex0 {

}

public class Test2 extends Ex0 implements Runnable {
	Test2(){
		i =4;
	}
	private String name;

	public Test2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		message(1);
		message(2);
	}

	private synchronized void message(int n) {
		System.out.println(name + " - " + n + " ");
	}

	public static void main(String[] args) {
		String str = "ihelloslkhellodjladfjhello";
		String findStr = "hello";
		int lastIndex = 0;
		int count = 0;

		while(lastIndex != -1){

		    lastIndex = str.indexOf(findStr,lastIndex);

		    if(lastIndex != -1){
		        count ++;
		        lastIndex += findStr.length();
		    }
		}
		System.out.println(count);
		
//		Ex0 t = new Test2();
		/*
		 * int data[] = {0,0,0,0,0,0,0}; int [] out = new int[data.length]; int j= 0;
		 * for(int i =0; i<data.length && j<out.length; i++){ if(data[i]==0 ){ out[j]=
		 * data[i]; if(j+1 < out.length){ out[j+1] = data[i]; j = j+1; } }else{ out[j] =
		 * data[i]; } j++; }
		 * 
		 * for(int i : out) { System.out.println(i); }
		 */

		/*
		 * System.out.println("1"); synchronized (args) { System.out.println("2"); try {
		 * args.wait(); } catch (InterruptedException e) { // TODO: handle exception }
		 * System.out.println("3"); }
		 */

		/*
		 * new Thread(new Test2("Wallace")).start(); new Thread(new
		 * Test2("Gromit")).start();
		 */

		/*
		 * try { throw new Ex1(); } catch (Ex0 ex) { System.out.println("Ex0 caught");
		 * }catch(Exception e) { System.out.println("exception"); }
		 */

		/*
		 * int x = 0; int y = 0; for (int z = 0; z < 5; z++) { if ((++x > 2) && (++y >
		 * 2)) x++; } System.out.println(x + " " + y);
		 */

//		int arr[] = { 1, 0, 2, 3, 0, 4, 5, 0 }; // 1
//
//		int k = 0;
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] == 0 && arr[i + 1] == 0)
//				i = i + 1;
//			else if (arr[i] == 0 && arr[i + 1] != 0) {
//				k = i;
//				break;
//			}
//		}
//
////		 {1,0,0,2,3,0,4,5}; 
//		recurr(arr, k);
//
//		for (int i : arr) {
//			System.out.println(i);
//		}

	}

	static int prev = 0;

	static void recurr(int arr[], int k) {

		for (int j = arr.length - 1; j > k; j--) {
			arr[j] = arr[j - 1];
		}

		k = k + 2;
		prev = k;
		for (int i = k; i < arr.length - 1; i++) {
			if (arr[i] == 0 && arr[i + 1] == 0)
				i = i + 1;
			else if (arr[i] == 0 && arr[i + 1] != 0) {
				k = i;
				break;
			}
		}
		if (prev == k || k == arr.length - 1) {
			return;
		}
		recurr(arr, k);
	}

}
