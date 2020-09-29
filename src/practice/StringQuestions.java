package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Intefaces.SplitIterator;

public class StringQuestions {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(8);
		list.add(7);
		
//		SplitIterator itr = new SplitIterator(list);
//		while (itr.hasNext()) {
//			Integer integer = (Integer) itr.next();
//			System.out.println(integer);
//		}
		
		Comparator<Integer> c = (Integer a, Integer b)->{
			return a.compareTo(b);
		};
		
//		list.stream().map(i -> i+2).forEach(System.out::println);
		list.stream().sorted(c).forEach(System.out::println);
		
//		String s1 = "Hello";
//		StringBuffer sb = new StringBuffer("Hello");
//		System.out.println(s1.equals(sb));
//		StringQuestions questions = new StringQuestions();
//		questions.removeDuplicatesFromString();
//		String s = "Today Is Monday";
//		questions.printReverseRecu(s);
	}

	public String printReverseRecu(String s) {
		if (s.isEmpty())
			return "";

		return printReverseRecu(s.contains(" ") ? s.substring(0, s.lastIndexOf(" ")) : " ")
				+ s.substring(s.lastIndexOf(" "), s.length());

	}

	// count number of "a" on this String
	public void maxOccurrenceInAString() {
		String s = "Today Is Monday";
		s = s.toLowerCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.toString(s.charAt(i)).equals("a")) {
				count++;
			}
		}
		System.out.println("Max occurrence : " + count);
	}

	public void maxConsecutiveOccurrenceInAString() throws Exception {
		String s = "aabccdddd";
		for (int i = 0; i < s.length(); i++) {
			// Counting occurrences of s[i]
			int count = 1;
			while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				i++;
				count++;
			}
			System.out.print(s.charAt(i) + "" + count + " ");
		}
		throw new Exception();
	}

	public void maximumOccurringString() {
		String s = "Java";
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			String s1 = Character.toString(s.charAt(i));
			int c = 1;
			if (map.containsKey(s1)) {
				c = map.get(s1) + 1;
			}
			map.put(s1, c);
		}

		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}
		System.out.println(maxEntry.getKey());
	}

	private void removeDuplicatesFromString() {
		Set<String> set = new HashSet<>();
		String s = "Hey Hoe Hey Hey";
		s = s.toLowerCase();
		String arr[] = s.split(" ");
		int i = 0;
		StringBuilder sb = new StringBuilder();
		for (String st : arr) {
			if (!set.contains(st)) {
				sb.append(st);
				sb.append(" ");
				set.add(st);
			}
		}
		System.out.println(sb.toString());
	}
}
