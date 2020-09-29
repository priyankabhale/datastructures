
public class MaxSubSquare {
	// method for Maximum size square sub-matrix with all 1s 
    static void printMaxSubSquare(int M[][]) 
    { 
        int i,j; 
        int R = M.length;         //no of rows in M[][] 
        int C = M[0].length;     //no of columns in M[][] 
        int S[][] = new int[R][C];      
          
        int max_of_s, max_i, max_j;  
      
        /* Set first column of S[][]*/
        for(i = 0; i < R; i++) 
            S[i][0] = M[i][0]; 
      
        /* Set first row of S[][]*/
        for(j = 0; j < C; j++) 
            S[0][j] = M[0][j]; 
          
        /* Construct other entries of S[][]*/
        for(i = 1; i < R; i++) 
        { 
            for(j = 1; j < C; j++) 
            { 
                if(M[i][j] == 1)  
                    S[i][j] = Math.min(S[i][j-1], 
                                Math.min(S[i-1][j], S[i-1][j-1])) + 1; 
                else
                    S[i][j] = 0; 
            }  
        }   
        
        for(i=0; i<R; i++ ) {
        	for(j=0; j<C; j++ ) {
        		System.out.print(S[i][j]+" ");
        	}
        	System.out.println("");
        }
          
        /* Find the maximum entry, and indexes of maximum entry  
            in S[][] */
        max_of_s = S[0][0]; max_i = 0; max_j = 0; 
        for(i = 0; i < R; i++) 
        { 
            for(j = 0; j < C; j++) 
            { 
                if(max_of_s < S[i][j]) 
                { 
                    max_of_s = S[i][j]; 
                    max_i = i;  
                    max_j = j; 
                }      
            }                  
        }      
          
        System.out.println("Maximum size sub-matrix is: "); 
        for(i = max_i; i > max_i - max_of_s; i--) 
        { 
            for(j = max_j; j > max_j - max_of_s; j--) 
            { 
                System.out.print(M[i][j] + " "); 
            }  
            System.out.println(); 
        }  
    }  
      
    // Driver program  
    public static void main(String[] args)  
    { 
        int M[][] = {{0, 1, 1, 0, 1},  
                     {1, 1, 0, 1, 0},  
                     {0, 1, 1, 1, 0}, 
                     {1, 1, 1, 1, 0}, 
                     {1, 1, 1, 1, 1}, 
                     {0, 0, 0, 0, 0}}; 
//				        0 1 1 0 1 
//				        1 1 2 1 1 
//				        0 1 1 1 1 
//				        1 1 2 2 1 
//				        1 2 2 2 1 
//				        0 1 1 1 1 

//        printMaxSubSquare(M);
        
        
        int r = M.length;
        int c = M[0].length;
        
        int S[][] = new int[r][c];
        
        // copy first row
        for(int i=0; i<c; i++ ) {
        	S[0][i] = M[0][i];
        }
        
        // copy first column
        for(int i=0; i<r; i++ ) {
        	S[i][0] = M[i][0];
        }
        
        for(int i=1; i<r; i++ ) {
        	for(int j=1; j<c; j++ ) {
        		int val = 0;
//        		take the upper value of the current index
            	int uper = S[i-1][j];
            	
//        		take the diagonal left value of the current index
            	int diagLeft = S[i-1][j-1];
            	
//        		take the left value of the current index
            	int left = S[i][j-1];
            	
//            	take the minimum of the three value and add one
            	if(M[i][j] == 1)  
            		val = Math.min(uper, Math.min(diagLeft, left)) + 1;
            	
//            	save it in the value
            	S[i][j] = val;
            }
        }
        
        for(int i=0; i<r; i++ ) {
        	for(int j=0; j<c; j++ ) {
        		System.out.print(S[i][j]+" ");
        	}
        	System.out.println("");
        }
        
        System.out.println(" ========================================== ");
        
        int max_of_s, max_i, max_j;  
        /* Find the maximum entry, and indexes of maximum entry  
        in S[][] */
	    max_of_s = S[0][0]; max_i = 0; max_j = 0; 
	    for(int i = 0; i < r; i++) 
	    { 
	        for(int j = 0; j < c; j++) 
	        { 
	            if(max_of_s < S[i][j]) 
	            { 
	                max_of_s = S[i][j]; 
	                max_i = i;  
	                max_j = j; 
	            }      
	        }                  
	    }  
        
	    System.out.println("Maximum size sub-matrix is: "); 
        for(int i = max_i; i > max_i - max_of_s; i--) 
        { 
            for(int j = max_j; j > max_j - max_of_s; j--) 
            { 
                System.out.print(M[i][j] + " "); 
            }  
            System.out.println(); 
        }  
        
        
    }

}
