package demo;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();
		while(testCases != 0) {
			int numberOfPoints = input.nextInt();
			int min = 0;
			int max = 0;
			boolean isFirstTime = true;
			while(numberOfPoints != 0) {
				int point = input.nextInt();
				if( isFirstTime ) {
					min = point;
					max = point;
					isFirstTime = false;
				}
				min = Math.min(min, point);
				max = Math.max(max, point);
				numberOfPoints--;
			}
			int distance = (max - min) * 2;
			System.out.println(distance);
			testCases--;
		}
		
		input.close();
	}

}
