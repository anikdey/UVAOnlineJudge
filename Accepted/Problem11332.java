package easy;

import java.util.Scanner;

public class Problem11332 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		while( number != 0 ) {
			int sum = sumOfDigit(number);
			System.out.println(sum);
			number = input.nextInt();
		}
		input.close();
	}

	private static int sumOfDigit(int number) {
		int sum = 0;
		while( number != 0 ) {
			sum += number %10;
			number /=10;
		}
		if( sum>9 ) {
			return sumOfDigit(sum);
		}
		return sum;
	}
	

}
