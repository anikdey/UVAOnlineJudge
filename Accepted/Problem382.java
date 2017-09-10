package easy;

import java.util.Scanner;

public class Problem382 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("PERFECTION OUTPUT");
		int number = input.nextInt();
		while( number != 0 ) {
			if( number ==1 ) {
				System.out.printf("%5d  DEFICIENT\n", number);
			} else {
				int sum = sum(number);
				if(sum>number) {
					System.out.printf("%5d  ABUNDANT\n", number);
				} else if(sum<number) {
					System.out.printf("%5d  DEFICIENT\n", number);
				} else {
					System.out.printf("%5d  PERFECT\n", number);
				}
			}
			number = input.nextInt();
		}
		System.out.println("END OF OUTPUT");
		input.close();
	}
	
	private static int sum(int number) {
		int sum = 1;
		int range = number/2;
		int counter =2;
		while(counter<=range) {
			if(number % counter == 0) {
				sum+=counter;
			}
			counter++;
		}
		return sum;
	}
	
}
