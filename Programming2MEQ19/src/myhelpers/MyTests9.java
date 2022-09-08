package myhelpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyTests9 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(3);
		nums.add(4);
		nums.add(2);
		
		System.out.println(nums);
		Collections.sort(nums);
		System.out.println(nums);
		
		Collections.reverse(nums);
		System.out.println(nums);
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student(1, "adin", "Ashby", 88, 'm'));
		students.add(new Student(2, "james", "brown", 28, 'm'));
		students.add(new Student(3, "mike", "conna", 35, 'm'));
		students.add(new Student(4, "mary", "conna", 23, 'f'));
		students.add(new Student(5, "mary", "conna", 18, 'f'));
		
		System.out.println(students);
		Collections.sort(students);
		System.out.println(students);
	}

}
