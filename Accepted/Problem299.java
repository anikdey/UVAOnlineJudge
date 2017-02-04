package beg;

import java.util.Scanner;

public class Problem299 {

	public static void main(String[] args) {
		
		int counter = 0;
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		while( counter < testCase ) {
			int numberOfCarriages = in.nextInt();
			int[] carriageArray = new int[numberOfCarriages];
			for(int i=0; i<numberOfCarriages; i++) {
				carriageArray[i] = in.nextInt();
			}
			int swapes = swapingCounter(carriageArray);
			System.out.println("Optimal train swapping takes "+swapes+" swaps.");
			
			counter++;
		}
		in.close();
	}
	
	private static int swapingCounter(int[] carriageArray) {
		
		int swapes = 0;
		int arrayLength = carriageArray.length;
		for(int i = 0; i<arrayLength-1; i++) {
			int j = i+1;
			int temp = carriageArray[j];
			while( i>=0 && carriageArray[i] > temp ) {
				carriageArray[i+1] = carriageArray[i];
				i--;
				swapes++;
			}
			carriageArray[i+1] = temp;
		}
		return swapes;
	}
}
