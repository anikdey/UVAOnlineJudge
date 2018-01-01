

import java.util.Scanner;

public class Problem1585 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		input.nextLine();
		while( testCase > 0 ) {
			
			int counter = 0;
			int sum = 0;
			
			String line = input.nextLine();
			int length = line.length();
			for( int i=0; i<length; i++ ) {
				if(line.charAt(i)=='O') {
					counter++;
					sum+=counter;
				} else {
					counter = 0;
				}
			}
			System.out.println(sum);
			testCase--;
		}
		
		input.close();

	}

}
