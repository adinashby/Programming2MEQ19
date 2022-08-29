package myhelpers;

public class MultiDimensionalExample {

	public static void main(String[] args) {
//		int[][] theArray = {
//	            {1, 2, 3, 4}, 		// 0 3
//	            {5, 6, 7, 8}, 		// 1 2
//	            {9, 10, 11, 12},	// 2 1
//	            {13, 14, 15, 16}	// 3 0
//	        };
		
		int[][] theArray = {
	            {1, 2, 3}, 		
	            {4, 5, 6}, 	
	            {7, 8, 9}	
	        };

	        int sumOfPrimaryDiagonal = 0;
	        int sumOfSecondaryDiagonal = 0;
	        
	        for(int row = 0; row < theArray.length; row++) {
	        	sumOfPrimaryDiagonal += theArray[row][row];
	        	sumOfSecondaryDiagonal += theArray[row][theArray.length - row - 1];
	        }
	        
	        System.out.println(sumOfPrimaryDiagonal);
	        System.out.println(sumOfSecondaryDiagonal);
	        
	        int sum = sumOfPrimaryDiagonal + sumOfSecondaryDiagonal;
	        
	        if (theArray.length % 2 != 0) {
	        	sum -= theArray[theArray.length / 2][theArray.length / 2];
	        }
	        
	        System.out.println("total sum:" + sum);

	}

}
