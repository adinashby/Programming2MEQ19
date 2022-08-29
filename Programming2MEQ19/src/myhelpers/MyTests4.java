package myhelpers;
import java.util.Arrays;

public class MyTests4 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		
		System.out.println(Arrays.toString(nums));
		
		int[][] numss = { 
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9, 10 }
		};
		
		System.out.println(numss[1][0]);
		System.out.println(numss[2][2]);
		
		System.out.println(Arrays.deepToString(numss));
		
		int[][] numss2 = new int[3][];
		
		System.out.println(Arrays.deepToString(numss2));
		
		numss2[0] = new int[5];
		numss2[0][3] = 99;
		
		System.out.println(Arrays.deepToString(numss2));
		
		int[][] numss3 = new int[4][4];
		
		double[][] numss4 = { new double[]{5.5, 2.2} };
		
		for(int i = 0; i < numss.length; i++) {
			for(int j = 0; j < numss[i].length; j++) {
				System.out.print(numss[i][j] + " ");
				// numss[i][j] = 9;
			}
			System.out.println();
		}
		
		for(int each : nums) {
			System.out.println(each);
		}
		
		for(int[] eachArray : numss) {
			for(int each : eachArray) {
				System.out.println(each);
			}
		}
	}

}
