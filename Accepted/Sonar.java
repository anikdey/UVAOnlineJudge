package demo;

import java.util.Scanner;

public class Sonar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		
		while( testCase != 0 ) {
			int row = input.nextInt();
			int col = input.nextInt();
			
			int numberOfSonarInRow = (row - 2)/3;
			
			if( (row - 2)%3 != 0 ) {
				numberOfSonarInRow += 1;
			}
			
			int numberOfSonarInCol = (col - 2)/3;
			
			if( (col - 2)%3 != 0 ) {
				numberOfSonarInCol += 1;
			}
			
			int totalSonar = numberOfSonarInRow * numberOfSonarInCol;
			System.out.println(totalSonar);

			testCase--;
		}
		
		input.close();

	}

}
