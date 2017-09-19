package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem10106 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while( input.hasNext() ) {
			BigInteger fInteger = input.nextBigInteger();
			BigInteger sBigInteger = input.nextBigInteger();
			BigInteger res = fInteger.multiply(sBigInteger);
			System.out.println(res);
		}
		input.close();

	}

}
