package easy;

import java.util.Scanner;


public class Problem913 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			long userInput = input.nextLong();
			System.out.println(sum(userInput));
		}
		input.close();
	}
	
	
	private static long sum(long number) {
		long sum = 0;
		long lineNumber = (long)Math.ceil(number / 2.0);
		sum = ((lineNumber*lineNumber*2)-1)*3-6;
		return sum;
	}
	
	/*
	private static long procedural(long number) {
		long numberOfLines = number;
		long incrementalValue = 1;
		long start = 1;
		long sum = 0;
		int counter = 0;
		breakPoint:
		for(long i=1; i<=numberOfLines; i++) {
			long difference = incrementalValue-3;
			for(long x=1; x<=incrementalValue; x++) {
				if(numberOfLines==incrementalValue && difference<x) {
					sum+=start;
					counter++;
					if(counter == 3) {
						break breakPoint;
					}
				}
				start+=2;
			}
			incrementalValue +=2;
		}
		System.out.println(sum);
		return sum;
	}
	*/
}
