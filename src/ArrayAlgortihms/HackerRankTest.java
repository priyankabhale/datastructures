package ArrayAlgortihms;

public class HackerRankTest {

	public static int min(int i, int arr[]) {
		int min = Integer.MAX_VALUE;
		i = i - 1;
		if(i==0)
			return arr[i];
		
		while (i > 0) {
			int temp = Math.min(arr[i], arr[i - 1]);
			if (temp < min) {
				min = temp;
			}
			i--;
		}

		return min;

	}

	public static void main(String[] args) {
//		8
		int arr[] = {4,4,9,2,3};//{ 2, 5, 1, 4 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			if (i != 0) {
				int d = min(i, arr);
				int result = arr[i] - d;
				if (result > 0) {
					sum += result;
				}
			} else {
				sum = arr[i];
			}
		}
		System.out.println(sum);
	}
}
