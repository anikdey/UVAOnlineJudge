package easy;

import java.util.Scanner;

public class Problem10327 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfElements = 0;
		while(input.hasNext()) {
			numberOfElements = input.nextInt();
			int[] array = new int[numberOfElements];
			for(int i=0; i<numberOfElements; i++) {
				array[i] = input.nextInt();
			}
			
			int counter = 0;
			for( int j=1; j<array.length; j++ ) {
				
				int key = array[j];
				int i = j-1;
				
				while(i>=0 && array[i]>key) {
					array[i+1] = array[i];
					i--;
					counter++;
				}
				array[i+1] = key;
			}
			System.out.println("Minimum exchange operations : "+counter);
		}
		/*
		
		int[] array = {3, 5, 8, 2, 1, 9, 7, 0};
		int counter = 0;
		for( int j=1; j<array.length; j++ ) {
			
			int key = array[j];
			int i = j-1;
			
			while(i>=0 && array[i]>key) {
				array[i+1] = array[i];
				i--;
				counter++;
			}
			array[i+1] = key;
		}
		
		for( int num : array ) {
			System.out.print(num+", ");
		}
		System.out.println();
		System.out.println(counter);
*/
		input.close();
		
	}

}