import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

import streams.Employee;

import java.util.TreeMap;

public class ParentTest {
	ParentTest() {
		System.out.println(this.hashCode());
	}

	public void walk() {
		System.out.println("Parent walk");
	}

	public void run() {
		System.out.println("Parent run");
		this.walk();
	}

	static void reverse(String s) {
		String arr[] = s.split("\\.");
		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			if (i != 0)
				ans += arr[i] + ".";
			else
				ans += arr[i];
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
//		ExecutorService exec = Executors.newFixedThreadPool(10);
//		ParentTest p = new ChildTest();
//		String s1 = "pqr.mno";
//		int[] numbers = { 1, 2, 3, 5, 10, 14, 17, 20, 25, 38, 49, 63, 72, 81, 97, 98, 99, 100, 101, 248, 253, 799, 1325,
//				1900, 2000, 2456, 1715 };
//		System.out.println(convertToRoman(2599));
//		reverse(s1);

		Dept dept = new Dept(1, "it");
		Dept dept1 = new Dept(1, "it");
		Dept dept2 = new Dept(1, "it");
		Dept dept3 = new Dept(1, "it");
		dept3 = dept2;

		HashMap<Dept, String> map = new HashMap<>();
		map.put(dept, "a");
		map.put(dept1, "b");
		map.put(dept2, "c");

//		System.out.println(map.get(dept3));// returns c

//		HashMap<Employee, String> map = new HashMap<>();
//		Employee e1 = new Employee();
//		e1.setId(1);
//		map.put(e1, "a");
//		e1.setId(3);
//
//		Employee e2 = new Employee();
//		e2.setId(2);
//
//		map.put(e2, "b");
//		for (Entry<Dept, String> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
		TreeMap<Employee, String > treemap = new TreeMap<>();
		Employee e1 = new Employee(1,"Ashish", 40000);
		Employee e2 = new Employee(1,"Priyanka", 42000);
		Employee e3 = new Employee(1,"Ashish", 80000);
		
		treemap.put(e1, "a");
		treemap.put(e2, "b");
		treemap.put(e3, "c");
		
		for (Entry<Employee, String > entry : treemap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static String convertToRoman(int number) {
		String[] thousands = { "", "M", "MM", "MMM" };
		String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String[] units = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

		return thousands[number / 1000] + hundreds[(number % 1000) / 100] + tens[(number % 100) / 10]
				+ units[number % 10];
	}

}

//class ChildTest extends ParentTest {
//
//	ChildTest() {
//		super();
//		System.out.println(this.hashCode());
//	}
//
//	@Override
//	public void walk() {
////		super.walk();
//		System.out.println("ChildTest walk");
//	}
//
//	@Override
//	public void run() {
//		super.run();
//		System.out.println("ChildTest run");
//	}
//
//}