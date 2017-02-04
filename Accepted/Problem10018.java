package beg;

import java.util.Scanner;

public class Problem10018 {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCaseCounter = 1;
		int testCase = 0;
		testCase = in.nextInt();
		
		while(testCaseCounter <= testCase) {
			long originalNumber = in.nextLong();
			int counter = 0;
			boolean isPalindrome = false;
			while(isPalindrome == false) {
				long reversedNumber = reverseNumber(originalNumber);				
				long sum = originalNumber + reversedNumber;
				long tempSum = sum;
				counter++;
				if( isPalindrome(sum) ) {
					System.out.println(counter+" "+sum);
					isPalindrome = true;
				} else {
					originalNumber = tempSum;
					reversedNumber = 0;
				}
			}
			testCaseCounter++;
		}
		in.close();
	}
	
	public static long reverseNumber(long originalNumber) {
		long reversedNumber = 0;
		while(originalNumber != 0) {
			long remainder = originalNumber % 10;
			reversedNumber = 10*reversedNumber + remainder;
			originalNumber /= 10;
		}
		return reversedNumber;
	}
	
	public static boolean isPalindrome(long summedNumber) {
		long palindromeNumber = 0;
		long tempPalindrome = summedNumber;
		while( summedNumber != 0 ) {
			long remainder = summedNumber % 10;
			palindromeNumber = 10*palindromeNumber + remainder;
			summedNumber /= 10;
		}
		if(tempPalindrome == palindromeNumber) {
			return true;
		} else {
			return false;
		}
	}
}
