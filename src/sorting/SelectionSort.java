package sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11 };

//		Arrays.asList(arr).stream().forEach(System.out::println);
//		Stream.of(arr).forEach(System.out::println);
// O(n^2)
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
