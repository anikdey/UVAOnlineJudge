package beg;

import java.util.Scanner;

public class Problem10055 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			int firstNumber = input.nextInt();
			int secondNumber = input.nextInt();
			int difference = 0;
			
			if( firstNumber > secondNumber ) {
				difference = firstNumber - secondNumber;
			} else {
				difference = secondNumber - firstNumber;
			}
			
			System.out.println(difference);
		}
		
		input.close();

	}

}
