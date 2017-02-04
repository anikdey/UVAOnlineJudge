package volumeOne;

import java.util.Arrays;
import java.util.Scanner;

public class Problem11727 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counter = 1;
		int testCase = in.nextInt();
		while(counter <= testCase) {
			int[] numberArray = new int[3];
			numberArray[0] = in.nextInt();
			numberArray[1] = in.nextInt();
			numberArray[2] = in.nextInt();
			Arrays.sort(numberArray);
			System.out.println("Case "+counter+": "+numberArray[1]);
			counter++;
		}
		in.close();
	}
}
