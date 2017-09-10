package recap;

import java.util.Scanner;

public class Problem10055 {

	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			long firstNumber = in.nextLong();
			long secondNumber = in.nextLong();
			long difference;
			if( firstNumber > secondNumber ) {
				difference = firstNumber - secondNumber;
			} else {
				difference = secondNumber - firstNumber;
			}
			System.out.println(difference);
		}
		in.close();
	}
}
