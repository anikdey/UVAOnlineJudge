package easy;

import java.util.Scanner;

public class Problem11743 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();
		input.nextLine();
		while(testCases>0) {
			String cardNumber = input.nextLine();
			
			int cardLength = cardNumber.length();
			
			boolean notToBeDoubled = true;
			
			int sumOfNonDoubledDigit = 0;
			int sumOfDoubledDigit = 0;
			
			
			for(int i=cardLength-1; i>=0; i--) {
				
				char ch = cardNumber.charAt(i);
				
				if( ch != ' ') {
					int number = Character.getNumericValue(ch);
					if(notToBeDoubled) {
						sumOfNonDoubledDigit +=number;
						notToBeDoubled = false;
					} else {
						int doubledNumber = number*2;
						
						int remainder = doubledNumber%10;
						doubledNumber /=10;
						sumOfDoubledDigit += remainder+doubledNumber;
						notToBeDoubled = true;
					}
				}
			}
			int total = sumOfNonDoubledDigit + sumOfDoubledDigit;
			if( total % 10 == 0 ) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
			testCases--;
		}
		input.close();
	}

}
