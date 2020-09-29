import java.util.HashSet;
import java.util.Set;

public class PracticeString {
	int equilibrium() {
		int arr[] = { 1,2,3,4,5,6,7,8 };
		int n = arr.length;
		int sum = 0; // initialize sum of whole array
		int leftsum = 0; // initialize leftsum

		/* Find sum of the whole array */
		for (int i = 0; i < n; ++i)
			sum += arr[i];

		for (int i = 0; i < n; ++i) {
			sum -= arr[i]; // sum is now right sum for index i

			if (leftsum == sum)
				return i;

			leftsum += arr[i];
		}

		/* If no equilibrium index found, then return 0 */
		return -1;
	}
	
	public void subarray() {
		int k=6;
		int arr[] = {2,1,3,-4,-2};
		boolean found = false;
		Set<Integer> set = new HashSet<>();
		int sum =0;
		for(int a : arr) {
			set.add(sum);
			sum+=a;
			if(set.contains(sum-k)) {
				found = true;
				break;
			}
		}
		System.out.println(found);
	}

	// Driver code
	public static void main(String[] args) {
		PracticeString p = new PracticeString();
		p.subarray();
	}

}
