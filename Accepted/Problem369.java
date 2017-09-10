package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem369 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger result;
		BigInteger bigInteger = input.nextBigInteger();
		BigInteger bigInteger2 = input.nextBigInteger();
		
		while( bigInteger.add(bigInteger2).compareTo(BigInteger.ZERO) != 0 ) {
			BigInteger mul = BigInteger.ONE;
			for(int i=0; i<bigInteger2.intValue(); i++) {
				mul = mul.multiply(bigInteger.subtract(new BigInteger(""+i)));
			}
			result = mul.divide(calculateFac(bigInteger2));
			//result = calculateFac(bigInteger).divide(calculateFac(bigInteger.subtract(bigInteger2)).multiply(calculateFac(bigInteger2)));
			System.out.println(bigInteger+" things taken "+bigInteger2+" at a time is "+result+" exactly.");
			bigInteger = input.nextBigInteger();
			bigInteger2 = input.nextBigInteger();
		}
		
		input.close();

	}
	private static BigInteger calculateFac(BigInteger bigInteger) {
		if( bigInteger.compareTo(BigInteger.ZERO) == 0 ) {
			return BigInteger.ONE;
		} else {
			return bigInteger.multiply(calculateFac(bigInteger.subtract(BigInteger.ONE)));
		}
	}
}
