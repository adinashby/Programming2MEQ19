package myhelpers;

import java.util.Random;

public class MyTests12 {

	public static void main(String[] args) {
//		try {
//			int[] input = {5, 3, 2};
//			
//			System.out.println(input[5]);
//			System.out.println(5 / 0);
//			System.out.println("Hello from after the exception has happened");
//		
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Oops you had arrayIndexOutOfBounds");
//		
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//			
//		} catch (Exception e) {
//			System.out.println("We're in exception");
//		
//		} finally {
//			System.out.println("We're in the finally block");
//		}
//		
//		System.out.println("Hello from the outside");
//		
//	    int num = 5;
//	    Random rand = new Random();
//	    int num2 = rand.nextInt(num);           // [0, 1, 2, 3, 4]
//	    int result = 0;
//	    int[] nums = {1, 2, 0, 3};
//
//	    try {
//	        for (int i = 0; i < 10; i++)	// may throw ArithmeticException and ArrayIndexOutOfBoundException
//	            result = num / nums[rand.nextInt(10)];
//	    }
//	    catch (ArrayIndexOutOfBoundsException e) {
//	        result = -1;
//	    }
//	    catch (ArithmeticException e) {
//	        result = 0;
//	    }
//	    System.out.print(result);
		
	    try {
	        m1();
//	        m2();	// a method also may throw ArithmeticException
//	        m3();
	    } catch (ArithmeticException e) {
	        System.out.println("Cannot divid by zero");
	    } catch (IndexOutOfBoundsException e) {
	        System.out.println("Index ouf of bound");
	    } catch (TwoNumbersTheSameException e) {
			System.out.println("Two numbers the same!");
		}

	}
	
	// throws ArithmeticException, IndexOutOfBoundException
	public static void m1() throws ArithmeticException, TwoNumbersTheSameException {
        Random rand = new Random();
        int num1 = 2;//rand.nextInt(5);
        int num2 = 2;//rand.nextInt(5);
        
        if (num1 == num2)
            // throw new TwoNumberTheSameException();  // default constructor with no message
            throw new TwoNumbersTheSameException(num1 + "");  // or adding a String as message
        int result = num1 / 0;
        System.out.println();      // Runtime exception: Arithmatic
    }

}
