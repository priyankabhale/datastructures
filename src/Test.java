import java.util.ArrayList;

//@TestInfo(priority = Priority.HIGH,createdBy = "Priyanka",tags = {"test","class"})
public class Test {

	public static void main(String[] args) {
		try {
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=0;i<12; i++) {
				list.add(i);
			}
			
			
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("NULL");
			throw new ArrayIndexOutOfBoundsException();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array");
			e.printStackTrace();
		}

//		DoSomething ds = (x, y) -> x+y;
//		System.out.println(ds.doSomethingPlease(1, 3));
//		ds.showa();
//		ds.show();
//		
//		BiFunction<Integer, Integer, Integer> bi = (a,b) -> a+b;
//		System.out.println(bi.apply(2, 3));

//		String s = "Hello";
//		System.out.println("len "+s.length());
//		System.out.println("begin "+s.substring(5));
//		System.out.println("begin end "+s.substring(5,5));

//		System.out.println(a);

//		Integer a = new Integer(1000);
////		Integer b = 1000;//new Integer(1000);
//		int b = 1000;
//		System.out.println();
//		System.out.println( a == b);
//		
//		LinkedHashSet<Integer> set = new LinkedHashSet<>();
//		set.add(null);
//		set.add(null);
//		Iterator<Integer> i = set.iterator();

//		HashMap<Employee, String> map = new HashMap<>();
//		
//		Employee e1 = new Employee(1, "Ashish", 2300);
//		map.put(e1, "e1");
//		System.out.println("Hashcode of e1 = "+ e1.hashCode());
//		
//		Employee e2 = new Employee(1, "Ashish", 2300);
//		map.put(e2, "e2");
//		System.out.println("Hashcode of e2 = "+ e2.hashCode());
//		
//		System.out.println(e1.equals(e2));
//		
//		System.out.println("Elements in map are ..");
//		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

//		Integer a = 127;
//		int b = 127;
//		System.out.println(a == b);

//		try {
//			System.out.println("TRY");
//			return;
//		} catch (Exception e) {
//			System.out.println("CATCH");
//		}finally {
//			System.out.println("FINALLY");
//		}

//		HashMap<String, Integer> map = new HashMap<>();
//		System.out.println(map.put("kani", 1));
//		System.out.println(map.put("kani", 2));
//		System.out.println(map.get(new String("kani")));

//		String s = new String("abc");
//		String s2 = "abc";
//		System.out.println(s == (s2));

//		Employee e = new Employee();
//		Employee e2 = new Employee();
//		System.out.println(e.equals(e2));

//		printRLE("GeeeEEKKKss");
//		printRLE("ccccOddEEE");

		String t = "01000000000000+0000+0000-001+000000000000000000000+000000000-001+000+000";
		try {
			System.out.println(Double.parseDouble(insertDecimalPoint(t.substring(0, 4),2, "t")));
			System.out.println(Double.parseDouble(insertDecimalPoint(t.substring(24, 28),2, "x")));
			System.out.println(Double.parseDouble(insertDecimalPoint(t.substring(28, 32),2, "y")));
			System.out.println(Double.parseDouble(insertDecimalPoint(t.substring(68, 72),3 , "z")));
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	static String insertDecimalPoint(String text, int d, String channelName) {
		String r = "";
		int i = 0;
		String newString = text;
		if(text.contains("-") || text.contains("+"))
			newString = text.substring(1,text.length());
		
		for (Character s : newString.toCharArray()) {
			if (i == d) {
				r +=".";
			}
			r += Character.toString(s);
			i++;
		}
		
		if(text.contains("-"))
			r = String.valueOf(Double.parseDouble(r) * (-1));
		if(channelName.equalsIgnoreCase("z"))
			return "-0.1";
		
		return r;
	}

	static void printRLE(String s) {
		for (int i = 0; i < s.length(); i++) {

			// Counting occurrences of s[i]
			int count = 1;
			while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				i++;
				count++;
			}
			System.out.print(s.charAt(i) + "" + count + " ");
		}

		System.out.println();
	}
}
