package practice;

public class ArrayTest {

	public int[] arr = { 9, 17, 46, 1, 6, 45, 8, 54, 67, 99 };// new int[50];
	int arrLength = 10;

	ArrayTest() {
		for (int i = 0; i < arrLength; i++) {
//			arr[i] = (int) (Math.random() * 10) + 10;
		}
	}

	public void delete(int index) {
		if (index > arrLength)
			return;

		for (int i = index; i < arrLength; i++) {
			arr[i] = arr[i + 1];
		}
		arrLength--;
	}

	public int getValueAtIndex(int index) {
		if (index < arrLength)
			return arr[index];

		return 0;
	}

	public boolean doesArrayContainsValue(int value) {
		boolean isValue = false;
		for (int i = 0; i < arrLength; i++) {
			if (arr[i] == value)
				isValue = true;
		}
		return isValue;
	}

	public void insert(int value) {
		if (arrLength < 50) {
			arr[arrLength] = value;
			arrLength++;
		}
	}

	public void print() {
		System.out.println("---------------------------------");
		for (int i = 0; i < arrLength; i++) {
			System.out.println("| " + i + " | " + arr[i] + " |");
		}
		System.out.println("---------------------------------");
	}

	public void linearSearch(int value) {
		String indexWithValue = "";
		for (int i = 0; i < arrLength; i++) {
			if (arr[i] == value)
				indexWithValue += i + " ";
		}
		System.out.println(indexWithValue);
	}

	/*
	 * array eg : 9,17,46,1,6,45,8,54,99 ; two loops (outer, inner) we compare
	 * adjacent elements of the array (inner loop) this comparision is done for the
	 * array length time (outer loop) in inner loop if the current element is
	 * greater than the next element we swap the elements
	 */
	public void bubbleSort() {
		for (int i = 0; i < arrLength - 1; i++) {
			for (int j = 0; j < arrLength - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(j, j + 1);
				}
			}
		}
	}

	public void swap(int indexOne, int indexTwo) {
		int temp = arr[indexOne];
		arr[indexOne] = arr[indexTwo];
		arr[indexTwo] = temp;
	}

	/*
	 * array should be sorted; We divide the array into half and save the index in
	 * arr[halfindex] ; If the value at which it is half is less, then we search the
	 * right side of the array ;if the value at which it is half is greater, then we
	 * search the left side of the array ;the above process continues till we find
	 * the value that matches arr[halfindex]
	 */
	public void binarySearch(int value) {
		int lowIndex = 0;
		int highIndex = arrLength - 1;

		while (lowIndex <= highIndex) {
			int middleIndex = (lowIndex + highIndex) / 2;
			if (arr[middleIndex] > value) {
//				search in left
				highIndex = middleIndex - 1;
			} else if (arr[middleIndex] < value) {
//				search in right
				lowIndex = middleIndex + 1;
			} else {
				System.out.println("Found value " + value + " at index " + middleIndex);
				break;
			}

		}
	}

	/*
	 * we take a random element , mostly the first element and we compare the random
	 * element to the rest of the array elements till we find the lowest value in
	 * the array; if the random element is greater than the iterating element we
	 * swap the value
	 */
	public void insertionSort() {
		for (int x = 0; x < arrLength; x++) {
			int min = x;
			for (int y = x; y < arrLength; y++) {
//				to get lowest in the array
				if (arr[min] > arr[y])
					min = y;
			}
			swap(x, min);
		}
	}

	/*
	 * Find the smallest elem. Swap it with the first elem; Find the second-smallest
	 * elem. Swap it with the second elem; Find the third-smallest elm. Swap it with
	 * the third elem; Repeat finding the next-smallest elm, and swapping it into
	 * the correct position until the array is sorted;
	 */
	public void selectionSort() {
		for (int i = 1; i < arrLength; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && temp < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		ArrayTest test = new ArrayTest();

//		test.bubbleSort();
//		test.binarySearch(8);
//		test.insertionSort();
		test.print();
		test.selectionSort();
		test.print();
	}
}
