package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem10079 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		while(number >=0) {
			BigInteger bi = new BigInteger(""+number);
			bi = bi.multiply(bi.add(BigInteger.ONE));
			bi = bi.divide((BigInteger.valueOf(2)));
			bi = bi.add(BigInteger.ONE);
			System.out.println(bi);
			number = input.nextInt();
		}
		input.close();
	}

}
