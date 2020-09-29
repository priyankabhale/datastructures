import java.util.Scanner;

public class Base {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int row = 4;// sc.nextInt();
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = (row - i)+2; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			int k = i;
			while(k>0 && i!=0) {
				System.out.print("*");
				k--;
			}
			System.out.println();
		}
	}

}
