package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem424 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		BigInteger sum = BigInteger.ZERO;
		BigInteger number;
		number = input.nextBigInteger();
		while( number.compareTo(BigInteger.ZERO) !=0 ) {
			sum = sum.add(number);
			number = input.nextBigInteger();
		}
		
		System.out.println(sum);
		input.close();
	}

}
