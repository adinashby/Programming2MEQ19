package myhelpers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyTest13 {

	public static void main(String[] args) {
		// 1,James,Smith,27
		// 2,George,Brown,35

//		String path = "files//sample.txt";
//		File file = new File(path);
//
//		try (Scanner input = new Scanner(file)) { // try with resource
//
//			while (input.hasNext()) {
//				String[] aLine = input.nextLine().split(",");
//
//				for (int i = 0; i < aLine.length; i++) {
//					System.out.println(aLine[i]);
//				}
//
//				System.out.println();
//			}
//
//		} catch (IOException e) {
//			System.out.print("File not found");
//		}

		String path = "files//result.txt";
		File file = new File(path);
		
		String[] names = {"James", "George", "Maria"};

		try (FileWriter fw = new FileWriter(file, true)) { // appending mode
			//fw.write("Hi Vanier\n");
			
			for(String each : names) {
				fw.write(each + "\n");
			}
			
		} catch (IOException e) {
			System.out.println("Fail to write to the file");
		}
	}

}
