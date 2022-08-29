package myhelpers;
import java.util.ArrayList;
import java.util.Scanner;

public class MyTests7 {

	public static void main(String[] args) {
		String input = "hey hi\nhello";
		
		Scanner scanner = new Scanner(input);
		
		System.out.println(scanner.next());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		
		ArrayList<ArrayList<Integer>> myList = new ArrayList<>();
		
		myList.add(new ArrayList<>());
		
		myList.get(0).add(99);
		myList.get(0).add(88);
		myList.get(0).add(77);
		
		myList.add(new ArrayList<>());
		
		myList.get(1).add(55);
		myList.get(1).add(44);
		
		System.out.println(myList.get(0).get(2));
		System.out.println(myList.get(1).get(0));

	}

}
