package collectiontests;

import java.io.IOException;

import ArrayAlgortihms.ATest;
import ArrayAlgortihms.BTest;

public class CTest extends BTest{
	public static void main(String[] args) {
		ATest b = new BTest();
		try {
			b.normalMethod();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // B Test
		b.specificA(); // A specific method 
		b.staticMethod(); //A Test static
		
		((BTest)b).specificB();
		((BTest)b).staticMethod();
		
		ATest a = new BTest();
		BTest b1 = (BTest) a;
		b1.name(new Integer(1));
		
		ATest.staticMethod();
		BTest.staticMethod();
		BTest.demoMethod();
		
//		List l = new ArrayList();
//		l = new LinkedList<>();
//		l = new Vector<>();
//		
//		Set s = new HashSet<>();
//		s = new LinkedHashSet<>();
//		
//		Map m = new HashMap<>();
//		m = new Hashtable<>();
//		
//		Arrays.copyOf(new int[] {}, 10);
		
//		byte a = 127; 
//		byte b = 127; 
//		b = a + b; // error : cannot convert from int to byte b += a; // ok
//		b+=a;

	}
}
