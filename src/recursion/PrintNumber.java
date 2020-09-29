package recursion;

public class PrintNumber {
	public static void main(String[] args) {
		print(5);
	}

	static void print(int i) {
		if (i == 0)
			return;
		else {
			System.err.println(i);
			print(i - 1);
		}
	}
	
	static void cateyes(int cat) {
		if(cat == 0)
			return;
		else {
			cateyes(cat);
		}
	}
}
