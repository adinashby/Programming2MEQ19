package myhelpers;
import java.util.Scanner;

public class MyTests {

	public static void main(String[] args) {
//		int myInteger = 5;
//		short myShort = 2;
//		char myChar = 'A';
//		long myLong = 12312L;
//
//		float myFloat = 3.5f;
//		double myDouble = 9.5d;
//
//		boolean myBoolean = true;
//
//		System.out.println(myInteger);
//
//		System.out.println(max(9.5, 9.5, 9.5));
//
//		System.out.println(Math.round(3.559898 * 100.0) / 100.0);
//
//		System.out.println(Math.PI);
//
//		String myString = "Hellos Vanier Students";
//
//		System.out.println(myString.length());
//		System.out.println(myString.charAt(2));
//		System.out.println(myString.indexOf("s"));
//		System.out.println(myString.lastIndexOf("s"));
//		System.out.println(myString.contains("Van"));
//		System.out.println(myString.contains("James"));
//
//		System.out.println(myString.substring(3));
//		System.out.println(myString.substring(7, 13));
//		System.out.println(myString.substring(19, myString.length()));
//		// System.out.println(myString.substring(19, 30)); error
//		System.out.println(myString.replace("s", "p"));
//		System.out.println(myString.replace("Vanier", "Dawson"));
//		System.out.println(myString);
//
//		System.out.println(myString.toUpperCase());
//		System.out.println(myString.toLowerCase());
//
//		String mySecondString = "Hello";
//		String myThirdString = "Hello";
//
//		System.out.println(myString.equalsIgnoreCase(mySecondString));
//		System.out.println(mySecondString.equals(myThirdString));
//
//		System.out.println(mySecondString == myThirdString);
//		System.out.println(new String("test") == "test");
//
//		System.out.println(String.format("%s: %d", "Age", 18));
//		System.out.printf("%s: %d, %d\n", "Age", 18, 25);

//		Random random = new Random();
//		
//		int num = random.nextInt(5);
//		int num2 = random.nextInt(6) + 1;
//		
//		System.out.println(num);
//		System.out.println(num2);
//		
		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Please enter the num: ");
//		num = scanner.nextInt();
//		double myInputDouble = scanner.nextDouble();
//		
//		System.out.println("You put: " + num);
//		System.out.println("You put: " + myInputDouble);
		
//		//String str = scanner.next();
//		String str2 = scanner.nextLine();
//		
//		//System.out.println("You put: " + str);
//		System.out.println("You put: " + str2);
		
		String myTestString = "Programming 2";
		
//		System.out.println(Character.isUpperCase(myTestString.charAt(0)));
//		System.out.println(Character.isLetter(myTestString.charAt(0)));
//		System.out.println(Character.isDigit(myTestString.charAt(0)));
//		System.out.println(Character.isDigit(myTestString.charAt(myTestString.length() - 1)));
//		
//		int age = 8;
//		
//		switch(age) {
//		case 1:
//		case 2:
//		case 3:
//			System.out.println("You're under 3!!");
//			break;
//		case 18:
//		case 19:
//			System.out.println("You're either 18 or 19!");
//			break;
//		default:
//			System.out.println("This is the default message");
//		}
		
		printCharacters(myTestString);
		
	
	}

	public static double max(double num1, double num2) {
		if (num1 > num2)
			return num1;

		return num2;
	}

	public static double max(double num1, double num2, double num3) {
		double result = num1;

		if (num1 > num2 && num1 > num3) {
			result = num1;

		} else if (num2 > num1 && num2 > num3) {
			result = num2;

		} else if (num3 > num1 && num3 > num2) {
			result = num3;
		}

		return result;

	}
	
	public static void printCharacters(String str) {
//	    for(int i = 0; i < str.length(); i++)
//	        System.out.println(str.charAt(i));
		
//	    int i = 0;
//	    
//	    while (i < str.length()) {
//	        System.out.println(str.charAt(i));
//	        i++;
//	    }
		
		int counter = -10;
		
		while(counter < 10) {
			System.out.println(counter);
			++counter;
		}
	}

}
