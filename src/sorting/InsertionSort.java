package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 10, 1, 6, 2 };
		int n = arr.length;

//		O(n^2)
		for (int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && temp < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}

//		quickSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	static void quickSort(int arr[], int lb, int ub) {
		if (lb < ub) {
			int loc = partition(arr, lb, ub);
			quickSort(arr, 0, loc - 1);
			quickSort(arr, loc + 1, ub);
		}
	}

	static int partition(int arr[], int lb, int ub) {
		int pivotal = arr[lb];
		int start = lb;
		int end = ub;

		while (start < end) {
			while (arr[start] <= pivotal && start < arr.length - 1)
				start++;

			while (arr[end] > pivotal)
				end--;

			if (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}

		int temp = arr[lb];
		arr[lb] = arr[end];
		arr[end] = temp;

		return end;
	}

}
