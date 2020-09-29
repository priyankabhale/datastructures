package sorting;

public class QuickSort {
//	worst case O(n^2)
//	best case O(n log n)
	public static void main(String[] args) {
		int arr[] = { 7, 6, 10, 5, 9, 2, 1, 15, 7 };
		quickSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void quickSort(int[] arr, int lb, int ub) {
		if (lb < ub) {
			int loc = sort(arr, lb, ub);
			quickSort(arr, 0, loc - 1);
			quickSort(arr, loc + 1, ub);
		}
	}

	static int sort(int[] arr, int lb, int ub) {
		int pivotal = arr[lb];
		int start = lb;
		int end = ub;

		while (start < end) {
			while (arr[start] <= pivotal && start < arr.length - 1) {
				start++;
			}

			while (arr[end] > pivotal) {
				end--;
			}

			if (start < end) {
//				swap(a[start], a[end])
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
//		swap(a[lb], a[end])
		int temp = arr[lb];
		arr[lb] = arr[end];
		arr[end] = temp;

		return end;
	}

}
