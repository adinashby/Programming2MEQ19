import java.util.Arrays;

public class MyTest3 {

	public static void main(String[] args) {
		int[] myIntArray = new int[5];
		
		double[] myDoubleArray = { 
				5.5, 3.6, 9.8
		};
		
		Car[] cars = new Car[3];
		String[] myStringArray = new String[5];
		char[] myCharArrays;
		
		
		myIntArray[0] = 55;
		myIntArray[2] = 25;
		myIntArray[4] = 1;
		
		System.out.println(myIntArray);
		//System.out.println(myIntArray[0]);
		
		for(int i = 0; i < myIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}
		
		System.out.println();
		
		myStringArray[0] = "PP";
		myStringArray[1] = "Hey";
		myStringArray[2] = "Hi";
		myStringArray[3] = "Vanier";
		myStringArray[4] = "Hello";
		
		System.out.println(Arrays.toString(myStringArray));
		System.out.println(Arrays.toString(myIntArray));
		
		System.out.println(Arrays.toString(myDoubleArray));
		
		myCharArrays = new char[] {'A', 'B'};
		
		Arrays.fill(myDoubleArray, 999.9);
		System.out.println(Arrays.toString(myDoubleArray));
		
		System.out.println(Arrays.toString(myIntArray));
		Arrays.sort(myIntArray);
		System.out.println(Arrays.toString(myIntArray));
		
		System.out.println(Arrays.toString(myStringArray));
		Arrays.sort(myStringArray);
		System.out.println(Arrays.toString(myStringArray));
		
		System.out.println("Hi".compareTo("Hi"));
		System.out.println("Hiiiip".compareTo("Hi"));
		System.out.println("Hi".compareTo("Hiiiip"));
		
		System.out.println("Hi".compareTo("Hk"));
		
		System.out.println("Hiiiii".compareTo("Hk"));
		
		// System.out.println(Arrays.equals(myIntArray, myIntArray));
		
//		int[] nums1 = {1, 2, 3};
//		
//		// int[] nums2 = Arrays.copyOf(nums1, 5);
//		int[] nums2 = Arrays.copyOfRange(nums1, 1, 2);
//		
//		System.out.println(Arrays.toString(nums2));
//		
//	    int[] values = { 1, 2, 3 };
//
//	    CopyExample copyExample = new CopyExample(values);
//
//	    copyExample.showData();
//	    values[0] = 13;
//	    copyExample.showData();
		
		for(String each : myStringArray) {
			System.out.println(each);
			
			for(char eachChar : each.toCharArray()) {
				System.out.println(eachChar);
			}
		}
		
		System.out.println();
		
		int[] nums = {1, 2, 3};
		
		for (int num : nums)
			   num++; 
		
		System.out.println(Arrays.toString(nums));
	    
		for (int i = 0; i < nums.length; i++)
		    nums[i]++;	
		
		System.out.println(Arrays.toString(nums));
		
		
		cars[0] = new Car("Blue", "Toyota");
		cars[1] = new Car("Yellow", "Porche");
		
		System.out.println(Arrays.toString(cars));
		
	}

}
