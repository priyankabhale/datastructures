package arrays.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Search, insert and delete in a sorted array
public class Example1 {
	public static void main(String[] args) {
		int[] arr = {1,5,3,2};
		iterateArray(arr);
	}
	
	static void iterateArray(int[] arr){
		Set<Integer> set = new HashSet();
	    int count = 0;
	    List<Integer> list = new ArrayList<>();
	    for(int l : arr){
	         System.out.println("List: "+l );
	         list.add(l);
	    }
	    for (int i = 0 ; i < arr.length; i++ ){
	      int n1 = (arr[i]);
	   //   System.out.println("List: "+i+" "+n1);
	      for (int j = 0 ; j < arr.length; j++ ){
	         if (i != j){
	             int n2 = arr[j];
	             int sum = n1 + n2;
	             System.out.println("sum: "+sum);
	             if (list.contains(sum)){
	            	 set.add(sum);
	             }
	         } 
	      }
	    }
	    System.out.println(set.size());
	}
}
