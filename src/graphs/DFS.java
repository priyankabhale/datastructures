package graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

//	 1 - 3 - 5
//  /
//0
//  \
//	 2 - 4 - 6
public class DFS {
	static ArrayList<ArrayList<Integer>> olist = new ArrayList<>();
	static int arr[][] = new int[7][7];

	public static void main(String[] args) {
		createAdjacencyMatrixDFS();
		System.out.println(" ====================== ");
		createAdjacencyListDFS();
	}

	static void addEdgeMatrix(int x, int y, int arr[][]) {
		arr[x][y] = 1;
		arr[y][x] = 1;
	}

	static void createAdjacencyMatrixDFS() {

		addEdgeMatrix(0, 1, arr);
		addEdgeMatrix(1, 3, arr);
		addEdgeMatrix(3, 5, arr);
		addEdgeMatrix(0, 2, arr);
		addEdgeMatrix(2, 4, arr);
		addEdgeMatrix(4, 6, arr);

		dfsMatix(0, 6);
	}

	static void dfsMatix(int start, int size) {
		Stack<Integer> stack = new Stack<>();
		boolean[] visited = new boolean[size + 1];

		stack.push(start);
		visited[start] = true;
		System.out.println(start);

		while (!stack.isEmpty()) {
			int v = adjUnvisited(stack.peek(), visited);
			if (v == -1)
				stack.pop();
			else {
				visited[v] = true;
				System.out.println(v);
				stack.push(v);
			}

		}

	}

	static int adjUnvisited(int v, boolean[] visited) {
		for (int j = 0; j < arr[v].length; j++) {
			if (arr[v][j] == 1 && !visited[j]) {
				return j;
			}
		}
		return -1;
	}

	static void createAdjacencyListDFS() {
		int size = 6;
		for (int i = 0; i <= size; i++) {
			olist.add(new ArrayList<>());
		}

		addEdge(0, 1);
		addEdge(1, 3);
		addEdge(3, 5);
		addEdge(0, 2);
		addEdge(2, 4);
		addEdge(4, 6);

		dfs(0, 6);
	}

	static void dfs(int v, int size) {
		boolean visited[] = new boolean[size + 1];
		Stack<Integer> stack = new Stack<>();
		stack.add(v);
		visited[v] = true;
		while (!stack.isEmpty()) {
			int elem = stack.pop();
			System.out.println(elem);
			ArrayList<Integer> ilist = olist.get(elem);
			Iterator<Integer> itr = ilist.iterator();

			while (itr.hasNext()) {
				Integer val = (Integer) itr.next();
				if (!visited[val]) {
					stack.add(val);
					visited[val] = true;
				}
			}
		}
	}

	static void addEdge(int x, int y) {
		olist.get(x).add(y);
		olist.get(y).add(x);
	}

}
