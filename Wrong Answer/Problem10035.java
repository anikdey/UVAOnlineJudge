package beg;

import java.util.Scanner;

public class Problem10035 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long firstNumber = in.nextLong();
		long secondNumber = in.nextLong();
		
		boolean flag = true;
		
		if( firstNumber == 0 && secondNumber==0 ) {
			flag = false;
		}
		
		while( flag ) {
			
			int carryOperations = calculateCarrayOperations(firstNumber, secondNumber);
			
			if( carryOperations == 0 ) {
				System.out.println("No carry operation.");
			} else if( carryOperations == 1 ) {
				System.out.println("1 carry operation.");
			} else if( carryOperations > 1 ) {
				System.out.println(carryOperations+" carry operations.");
			}
			
			firstNumber = in.nextInt();
			secondNumber = in.nextInt();
			if( firstNumber == 0 && secondNumber==0 ) {
				flag = false;
			}
		}
		
		in.close();
	}
	
	private static int calculateCarrayOperations(long firstNumber, long secondNumber) {
		int carryOperations = 0;
		int previousCarryAmount = 0;
		
		while( firstNumber!=0 || secondNumber!=0 ) {
			long firstRemainder = firstNumber % 10;
			long secondRemainder = secondNumber % 10;
			long sum = firstRemainder + secondRemainder + previousCarryAmount;
			if(sum>=10) {
				carryOperations++;
				previousCarryAmount = 1;
			}
			firstNumber /= 10;
			secondNumber /= 10;
		}
		return carryOperations;
	}
	
}
