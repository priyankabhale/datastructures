package segmenttree;

import java.util.Arrays;

public class XORRange {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9, 11 };
		int a = 1;
		int b = 3;
		int n = arr.length;

		int height = (int) (Math.ceil(Math.log(arr.length) / Math.log(2)));
		int maxsize = 2 * (int) Math.pow(2, height) - 1;

//		int tree[] = new int[(2 * n) + 2];
		int tree[] = new int[maxsize];
		buildtree(arr, tree, 0, 0, n - 1); // index is 1
		System.out.println(Arrays.toString(tree));
	}

	static int buildtree(int arr[], int tree[], int index, int ts, int te) {
		if (ts == te) {
			tree[index] = arr[ts];
			return arr[ts];
		}

		int mid = (ts + te) / 2;
		tree[index] = buildtree(arr, tree, (2 * index) + 1, ts, mid)
				^ buildtree(arr, tree, ((2 * index) + 2), mid + 1, te);
		return tree[index];
	}

	static void getXorFromRange(int tree[], int index, int ts, int te, int l, int r) {
//		the current node range lies completely between the required range
//		r1 <= start && r2 >= end
		if(l<=ts && r>=te) {
			
		}
		
		
	}
}
