package streams;

import java.util.Arrays;

public class ArrayIteration {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
	            11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }; 
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("Sum: "+sum);
//		Boolean result = Arrays.stream(arr).anyMatch(e -> e%2==0);
//		Boolean result = Arrays.stream(arr).allMatch(e -> e%2==0);
		Boolean result = Arrays.stream(arr).noneMatch(e -> e%2==0);
		System.out.println("Result: "+result);
		
		System.out.println("Example of reduce() :"); 
        System.out.println(Arrays.stream(arr) 
                               .reduce((x, y)->x + y)); 
		
//		System.out.println("Printing elements .. ");
//		Arrays.stream(arr).asLongStream().forEach(System.out::println);
//		Arrays.stream(arr).asDoubleStream().forEach(System.out::println);
//		Arrays.stream(arr).forEach(System.out::println);
	}

}
