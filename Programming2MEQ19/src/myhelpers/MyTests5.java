package myhelpers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyTests5 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>(100);
		
		// myArray[0] = 5;
		
		myList.add("James");
		myList.add("John");
		myList.add("George");
		
		// myList.remove("John");
		myList.remove(2);
		
		System.out.println(myList);
		
		ArrayList<Integer> myIntList = new ArrayList<>(100);
		
		myIntList.add(5);
		myIntList.add(10);
		myIntList.add(15);
		
		myIntList.remove(new Integer(5));
		
		myIntList.add(1, 99);
		
		System.out.println(myIntList);
		
		// myIntList.clear();

		System.out.println(myIntList.contains(new Integer(10)));
		
		System.out.println(myIntList.get(1));
		
		// myIntList.get(1) = 5; error!
		
		myIntList.set(1, 5);
		System.out.println(myIntList);
		
		System.out.println(myIntList.isEmpty());
		
		System.out.println(myIntList.indexOf(new Integer(15)));
		
		System.out.println(myIntList.size());
		
		// myIntList.toArray();
		
		myIntList.trimToSize();
		
		Integer[] nums = {1, 2, 3, 1, 1, 1};
		
		ArrayList<Integer> newList = new ArrayList(Arrays.asList(nums));
	
		System.out.println(newList);
		
		Collections.sort(newList);  // for sorting
		System.out.println(newList);
		
		Collections.reverse(newList);
		System.out.println(newList);

		
		
	}

}
