package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem374 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
//			String bString = input.nextLine();
//			String pString = input.nextLine();
//			String mString = input.nextLine();
			
//			BigInteger b1 = new BigInteger(bString);
//			BigInteger p1 = new BigInteger(pString);
//			BigInteger my = b1.modPow(p1,new BigInteger(mString));
			
			BigInteger b1 = input.nextBigInteger();
			BigInteger p1 = input.nextBigInteger();
			BigInteger m = input.nextBigInteger();
			BigInteger my = b1.modPow(p1,m);
			System.out.print(my+"\n");
		}

		input.close();
	}

}
