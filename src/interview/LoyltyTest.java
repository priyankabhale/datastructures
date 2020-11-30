package interview;

import java.util.HashMap;
import java.util.Map;

public class LoyltyTest {
	public static void main(String[] args) {

		Map<StringBuffer, String> map = new HashMap<>();
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb1 = new StringBuffer("abc");
		map.put(sb, "xy");
		map.put(sb1, "xyz");
		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

//		double[] arr = {1.01,
//				1.01,
//				1.01,
//				1.4,
//				2.4};
//
//		Arrays.sort(arr);
//		int left = 0;
//		int right = arr.length - 1;
//		int count = 0;
//		while (left <= right) {
//			if (left == right) {
//				count++;
//				break;
//			}
//			if (arr[left] + arr[right] <= 3.0) {
//				left++;
//				right--;
//				count++;
//			} else {
//				right--;
//				count++;
//			}
//		}
////		return (count);
//		System.out.println(count);
	}

	static int count = 0;

	public static int solution(String s) {

		if (s.equals("0"))
			return count;

		// write your code in Java SE 8
		if (s != null && !s.equals("")) {
			int val = binaryToInteger(s);
			System.out.println(val);
			count = count + 1;
			if (val % 2 != 0) {
				val = val - 1;
				if (val != 0)
					count = count + 1;
			}
			solution(Integer.toBinaryString(val / 2));
		}
		return count;
	}

	public static int binaryToInteger(String binary) {
		char[] numbers = binary.toCharArray();
		int result = 0;
		for (int i = numbers.length - 1; i >= 0; i--)
			if (numbers[i] == '1')
				result += Math.pow(2, (numbers.length - i - 1));
		return result;
	}
}
