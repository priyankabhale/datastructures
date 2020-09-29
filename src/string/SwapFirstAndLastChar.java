package string;

import java.util.Arrays;

public class SwapFirstAndLastChar {
	public static void main(String[] args) {
		int d = 69;
		int arr[] = { 40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53, 57, 2, 81, 87, 42, 66, 90, 45,
				20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 25, 29, 72, 33, 30, 4,
				20, 71, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65, 25 };
		int n = arr.length;
		int arr1[] = new int[d];
		;
		for (int i = 0; i < n; i++) {
			if (i < d) {
				arr1[i] = arr[i];
			} else {
				arr[i - d] = arr[i];
			}
		}
		int i = n - d;
		int j = 0;
		for (; i < n; i++) {
			arr[i] = arr1[j];
			j++;
		}
		Arrays.stream(arr).forEach(e->System.out.print(e+" "));
//		System.out.println(Arrays.toString(arr).replaceAll(",", " "));

		/*
		 * String s = "geeks for geeks"; char[] ch = s.toCharArray();
		 * 
		 * for (int i = 0; i < ch.length; i++) { if (i == 0) ch[i] =
		 * s.charAt(ch.length-1); if (i == ch.length - 1) ch[i] = s.charAt(0); }
		 * System.out.println(new String(ch));
		 */
	}

}
