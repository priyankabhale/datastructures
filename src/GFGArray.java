public class GFGArray {
	public static void main(String[] args) {
		getMissingNo();
	}
	
	static void getMissingNo() 
    {
		int[] a = { 1, 2, 3, 5 };
		int n =  a.length;
        int total = 1;
        for (int i = 2; i <= (n + 1); i++)
        {
            total += i;
            total -= a[i - 2];
        }
        
//        int i, total;
//        total = (n + 1) * (n + 2) / 2;
//        for (i = 0; i < n; i++)
//            total -= a[i];
        
        System.out.println(total);
    }
	
	static int subArraySum() 
    { 
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 }; 
        int n = arr.length; 
        int sum = 23; 
        int curr_sum = arr[0], start = 0, i; 
  
        // Pick a starting point 
        for (i = 1; i <= n; i++) { 
            // If curr_sum exceeds the sum, 
            // then remove the starting elements 
            while (curr_sum > sum && start < i - 1) { 
                curr_sum = curr_sum - arr[start]; 
                start++; 
            } 
  
            // If curr_sum becomes equal to sum, 
            // then return true 
            if (curr_sum == sum) { 
                int p = i - 1; 
                System.out.println( 
                    "Sum found between indexes " + start 
                    + " and " + p); 
                return 1; 
            } 
  
            // Add this element to curr_sum 
            if (i < n) 
                curr_sum = curr_sum + arr[i]; 
        } 
  
        System.out.println("No subarray found"); 
        return 0; 
    } 

	
	void reverse(String str) 
    { 
        if ((str==null)||(str.length() <= 1)) 
           System.out.println(str); 
        else
        { 
            System.out.print(str.charAt(str.length()-1)); 
            reverse(str.substring(0,str.length()-1)); 
        } 
    }
}
