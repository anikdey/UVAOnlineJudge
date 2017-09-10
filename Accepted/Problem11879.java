package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem11879 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger bi  = input.nextBigInteger();
		while( bi.compareTo(BigInteger.ZERO) != 0 ) {
			int lastDigit = bi.remainder(BigInteger.valueOf(10)).intValue();
			bi = bi.divide(BigInteger.TEN);
			bi = bi.subtract(BigInteger.valueOf(lastDigit * 5));
			if (bi.remainder(BigInteger.valueOf(17)).intValue() == 0)
                System.out.println(1);
            else
                System.out.println(0);
			bi  = input.nextBigInteger();
		}
		input.close();

	}

}
