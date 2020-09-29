
public class ConsecutiveOne {
	
	public static void main(String[] args) {
		countMaxConsecOne();
//		countMaxConsecOne_Eff();
	}
	
	// left shift number 
	// and operation of original number and left shifted number
	// can only work for 1's
	static void countMaxConsecOne_Eff(){
		int num = 211184;
		int count = 0;
		while(num > 0) {
			num = num & (num << 1);
			count++;
		}
		System.out.println(count);
	}
	
	static void countMaxConsecOne(){
		int arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
		int count = 0;
		int maxCount = 0;
		for(int i =0; i< arr.length; i++) {
			if(arr[i] == 1) {
				count = count+1;
			}else {
				if(maxCount < count) {
					maxCount=count;
				}
				count = 0;
			}
		}
		if(maxCount < count) {
			maxCount=count;
		}
		System.out.println(maxCount);
	}

}
