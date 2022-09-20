package myhelpers;

public class MyTests11 {

	public static void main(String[] args) {
		//printInfo();
		//printInfo(5);
		System.out.println(sumRecursion(5));
	}
	
	public static void printInfo() {
	    System.out.println("Hello");
	    printInfo();		// calls itself
	}
	
	public static void printInfo(int num) {
	    // base case: pre-knowledge, you know what to do without any calcualtion
	    if (num == 0)
	        return;

	    // general pattern: real action you want to do for general situation, and you should call the method itself with an update in this part,
	    System.out.println("Hello");
	    printInfo(num - 1);
	}
	
	public static int sumRecursion(int num) {
	    // base case
	    if (num == 0)
	        return 0;

	    // general pattern
	    return sumRecursion(num - 1) + num - 1;
	}

}
