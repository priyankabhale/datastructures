package segmenttree;

import java.util.Arrays;

public class BuildSegmentTree {
	public static void main(String[] args) {
//		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int arr[] = { 1, 3, 5, 7, 9, 11 };
		
//		real caluation of tree size
		int height = (int)(Math.ceil(Math.log(arr.length) /  Math.log(2)));
        int maxsize = 2 * (int) Math.pow(2, height) - 1;
		
		int treeArr[] = new int[(2 * arr.length)+2];
		int arrstartIndex = 0;
		int arrendIndex = arr.length - 1;
		buildtree(arr, treeArr, arrstartIndex, arrendIndex, 1);
		Arrays.stream(treeArr).forEach(System.out::println);
//		System.out.println(getSum(0, treeArr, arrstartIndex, arrendIndex, 5, 8));
//		int u = 5;
//		int diff = u - arr[0];
//		arr[0] = 5;
//		update(treeArr, 0, arrstartIndex, arrendIndex, 0, diff);

	}

//	save sthe sum starting from index 0;
	static void buildtree(int arr[], int tree[], int start, int end, int index) {
		if (start == end) {
			tree[index] = arr[start];
			return;
		}

		int mid = (start + end) / 2;
		buildtree(arr, tree, start, mid, 2 * index);
		buildtree(arr, tree, mid + 1, end, (2 * index) + 1);

		tree[index] = tree[2 * index] + tree[(2 * index) + 1];

	}

	static int buildtreeNew(int arr[], int tree[], int start, int end, int index) {
		if (start == end) {
			tree[index] = arr[start];
			return tree[index];
		}

		int mid = (start + end) / 2;
		tree[index] = buildtreeNew(arr, tree, start, mid, 2 * index)
				+ buildtreeNew(arr, tree, mid + 1, end, (2 * index) + 1);
		return tree[index];
//		tree[index] = tree[2 * index] + tree[2 * index + 1];

	}

	static int getSum(int index, int[] tree, int start, int end, int r1, int r2) {
//		total overlap
		if (r1 <= start && r2 >= end)
			return tree[index + 1];
//		no overlap
		if (end < r1 || start > r2)
			return 0;

//		partial overlap
		int mid = (start + end) / 2;
		return getSum((2 * index) + 1, tree, start, mid, r1, r2) + getSum((2 * index) + 2, tree, mid + 1, end, r1, r2);
	}

	static void update(int tree[], int index, int start, int end, int pos, int diff) {
		if (start > pos || end < pos) {
			return;
		}

		tree[index] += diff;

		if (start != end) {
			int mid = (start + end) / 2;
			update(tree, (2 * index) + 1, start, mid, pos, diff);
			update(tree, (2 * index) + 2, mid + 1, end, pos, diff);
		}

	}

}
