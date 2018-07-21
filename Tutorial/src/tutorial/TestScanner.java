package tutorial;

import java.io.*;
import java.util.Scanner;



public class TestScanner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// pass the patch to the file as a parameter
		File file = new File("c:\\temp\\scannertest.txt");
		Scanner sc = new Scanner(file);
		
		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
		
		sc.close();
	}
	
	
}
