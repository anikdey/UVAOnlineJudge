package easy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem113 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			double n = input.nextInt();
			input.nextLine();
			BigDecimal power = new BigDecimal((1.0/n));
			String p2 = input.nextLine();
			BigInteger bi = new BigInteger(p2);
			double number = Math.pow(bi.doubleValue(),power.doubleValue());
			System.out.println(Math.round(number));
		}
		input.close();
	}

}
