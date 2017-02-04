package beg;

import java.util.Scanner;

public class Problem11172 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counter = 1;
		int textCase = in.nextInt();
		while(counter<=textCase) {
			
			int firstNumber = in.nextInt();
			int secondNumber = in.nextInt();
			
			if(firstNumber>secondNumber) {
				System.out.println(">");
			} else if(firstNumber<secondNumber) {
				System.out.println("<");
			} else {
				System.out.println("=");
			}
				
			counter++;
		}
		in.close();

	}

}
