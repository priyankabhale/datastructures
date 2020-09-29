import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Median {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random rnd = new Random(); 
		
		for(int i=0; i<10; i++) {
			int ran = rnd. nextInt(100);
			list.add(ran);
			Collections.sort(list);
			System.out.println("added elem : "+ran);
			if(list.size() % 2 == 0) {
				int sum = 0;
				for(int s : list) {
					sum = sum+s;
				}	
				System.out.println("Median of even size is: "+sum/2);
			}else {
				int q = list.size() / 2;
				System.out.println("Median of odd size is: "+list.get(q));
			}
		}
	}
}
