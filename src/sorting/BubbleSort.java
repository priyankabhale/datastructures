package sorting;

public class BubbleSort {
	public static void main(String[] args) {
//		long time = new Date().getTime();
//		int[] arr = { 8, 9, 10, 6, 4, 7 };
		
//		best case O(n)
//		worst case O(n^2)
		
		int[] arr = { 16, 14, 5, 6, 8 };
		for (int i = 0; i < arr.length - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = false;
				}
			}
			if (flag)
				break;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
