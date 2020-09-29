import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class MyClass extends Thread {
	public static void main(String[] args) {
//		StringBuffer sb1 = new StringBuffer("Hellow");
//		StringBuffer sb2 = new StringBuffer("Hellow");
//		System.out.println(sb1.equals(sb2));
//		
//		String sb1 = new String("Hellow");
//		String sb2 = new String("Hellow");
//		System.out.println(sb1.equals(sb2));

//		String s = "HelloWorld";
//		Set<Character> set = new HashSet();
//		for(int i =0; i<s.length();i++) {
//			Character c = s.charAt(i);
//			if(set.contains(c))
//				System.out.println(c);
//			else
//				set.add(c);
//		}

//		MyClass thread = new MyClass();
//		thread.start();
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("This code is outside of the thread");

//		1 - 3 - 6
//		|	|
//		2 - 4
//		    |
//		    5

//	j->	1	2	3	4	5	6
//	i
//	|	
//	1	0	1	1	0	0	0 
//	2	1	0	0	1	0	0
//	3	1	0	0	1	0	1
//	4	0	1	1	0	1	0
//	5	0	0	0	0	0	0

//		arr - 5 - visited nodes {}
//		DFS
//		List<List<Integer>>  list = new ArrayList<>();
////		1
//		List<Integer> templist = new ArrayList<>();
//		templist.add(2,3);
//		list.add(templist);
////		2
//		templist = new ArrayList<>();
//		templist.add(1,4);
//		list.add(templist);
////		3
//		templist = new ArrayList<>();
//		templist.add(1,4);
//		list.add(templist);
////		4
//		templist = new ArrayList<>();
//		templist.add(2,5);
//		list.add(templist);
////		5
//		templist = new ArrayList<>();
//		templist.add(4);
//		list.add(templist);
////		6
//		templist = new ArrayList<>();
//		templist.add(3);
//		list.add(templist);

//		job Job_1 Job2 job_3 job_4
//		pof 10    20    30    40
//		dd  1     3      3     1 

//		job
//		dd - 1

//		Set<Integer> se
//		tailor
//		dowsthework

		int arr[] = {7 ,10,4,20,15};
		ArrayList<Integer> l = new ArrayList<>();
		for(int i: arr) {
			l.add(i);
		}
		TreeSet<Integer> tree = new TreeSet<>(l);
		Iterator<Integer> it = tree.iterator();
		int c = 0;
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			c++;
			if (c == 4)
				System.out.println(i);

		}
		
		l.stream().forEach(System.out::print);
	}

	public void run() {
		System.out.println("This code is running in a thread");
	}
}
