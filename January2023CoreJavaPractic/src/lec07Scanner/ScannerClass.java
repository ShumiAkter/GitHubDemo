package lec07Scanner;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		System.out.println("Please print your name here: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner .nextLine();
		String laString  = scanner .nextLine();
		String fullnameString  = name+laString;
		System.err.println("Your name is "+fullnameString);
		scanner.close();
		
	}
	


}
