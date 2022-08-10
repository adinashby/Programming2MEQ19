
public class MyTests {

	public static void main(String[] args) {
		int myInteger = 5;
		short myShort = 2;
		char myChar = 'A';
		long myLong = 12312L;
		
		float myFloat = 3.5f;
		double myDouble = 9.5d;
		
		boolean myBoolean = true;
		
		System.out.println(myInteger);
		
		System.out.println(max(9.5, 9.5, 9.5));
		
		System.out.println(Math.round(3.559898 * 100.0) / 100.0);
		
	}
	
	public static double max(double num1, double num2) {
		if(num1 > num2)
			return num1;
		
		return num2;
	}
	
	public static double max(double num1, double num2, double num3) {
		double result = num1;
		
		if(num1 > num2 && num1 > num3) {
			result = num1;
		
		} else if(num2 > num1 && num2 > num3) {
			result = num2;
		
		} else if(num3 > num1 && num3 > num2) {
			result = num3;
		} 
		
		return result;
		
	}

}
