package interview;

import java.util.Arrays;

public class InctureTest {
//	int x=4;
//	
//	static {
//		int y = 7;
//	}

//	int num1 = 3;
//	static int num2 = 5;
//
//	InctureTest(int num1, int num2) {
//		if (num2 < 30) {
//			this.num2 = num2;
//		}
//		num1 = num1;
//	}
	
	
	

	public static void main(String[] args) {
		String s ="";
		
//		System.out.println(1*2+3^4/5);
		
//		String temp = "10.87";
//		int a = Integer.parseInt(temp);
//		System.out.println(a);
		
//		int[] org = new int[] {1,2,3};
//		int [] original = Arrays.copyOf(org, 5);
//		int [] copy = Arrays.copyOfRange(original, 0,4);
//		for(int i=0;i<copy.length;i++) {
//			System.out.println(copy[i]+" ");
//		}
		
		
//		int p=5;
//		System.out.println("hello");
//		5<6?5:6;
		
//		for(int i=0;i>5;) {
//			System.out.println("hello");
//		}
		
//		Newthread newThread = new Newthread();
//		newThread.setDaemon(true);
//		newThread.start();
//		System.out.println("Completed");
		
//		System.out.println(Pattern.matches("^[^\\d].*", "123abc"));
//		System.out.println(Pattern.matches("^[^\\d].*", "abc123"));
//		System.out.println(Pattern.matches("(^[^\\d].*)(\\d)", "123abcxyz"));
//		System.out.println(Pattern.matches("(^[^\\d].*)(\\d)", "abc123xyz"));
		
//		double data = 20.324;
//		int sum= 6;
//		float value = 5.1f;
//		System.out.println(data + sum +value);
		
//		InctureTest s1 = new InctureTest(9,10);
//		InctureTest s2 = new InctureTest(12,22);
//		System.out.println(s1.num1+" "+s1.num2+" " +s2.num1+" "+s2.num2);
		
//		foo(null);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy G");
//		try {
//			Date parse = sdf.parse("30/01/-2020 AD");
//			System.out.println(sdf.format(parse));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		int x =5;
//		{
//			int y = 6;
//			System.out.println(x +" "+y);
//		}

//		System.out.println(1+
//				2==+
//				3+
//				+5+
//				++6+
//				--7);

//		out.println("ABC");

//		ArrayList<String> a = new ArrayList<>();
//		a.add("A");
//		a.add("B");
//		a.add("C");
//		a.add(1,"D");
//		System.out.println(a);

//		String s1 = "abc";
//		String s2 = "abc";
//		System.out.println(s1 == s2);

//		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
//		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));
//		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));
//		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));
//		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));
	}

	public static void foo(Object o) {
		System.out.println("o");
	}

	public static void foo(String s) {
		System.out.println("s");
	}
//	public static void main(String[] args) {
////		find the len
//		int len = 0;
//		Node node = head;
//		while (node.next != null) {
//			len++;
//			node = node.next;
//		}
//		int n = 2;
//		int pos = len - n;
//		int i = 0;
//		node = head;
////		iterate through the list
//		while (node.next != null) {
//			if (i == pos) {
//				node.next = node.next.next;
//			}
//			i++;
//			node = node.next;
//		}
//
//		String s1 = "HelloWorld";
//		String s2 = "Well";
//		int k = 0;
//		boolean flag = false;
//		for (int i = 0; i < s2.length(); i++) {
//			char c2 = s2.charAt(i);
//
//			for (int j = k; j < s1.length(); j++) {
//				char c1 = s1.charAt(j);
//				System.out.println(c1 + " " + c2);
//				if (c1 == c2) {
//					if (i == s2.length() - 1)
//						flag = true;
//					k++;
//					k = j;
//					break;
//				}
//			}
//		}
//		System.out.println(flag);
//
////		for (int i = 0; i < s1.length(); i++) {
////			char c = s1.charAt(i);
////
////			if (s2.charAt(0) == c) {
////				k = i;
////				for (int j = 0; j < s2.length(); j++) {
////					while (i < s1.length()) {
////						c = s1.charAt(i);
////						if (c == s2.charAt(j))
////							System.out.println(c);
////						else
////							break;
////						i++;
////					}
////
////				}
////				i = k;
////			}
////		}
//
//	}

}

class Newthread extends Thread{
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.println(i);
		}
	}
}
