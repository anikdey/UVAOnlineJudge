package easy;

import java.util.Scanner;

public class Problem10970 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while(input.hasNext()) {
			int numberOfRow = input.nextInt();
			int numberOfCol = input.nextInt();
			int horizontalCut = horizontalCut(numberOfRow, numberOfCol);
			int verticalCut = verticalCut(numberOfRow, numberOfCol);
			int min = Math.min(horizontalCut, verticalCut);
			System.out.println(min);	
		}
		input.close();
	}
	private static int horizontalCut(int numberOfRow, int numberOfCol) {
		int numberOfCut = 0;
		int hCut = numberOfRow-1;
		int vCut = (numberOfCol -1) * numberOfRow;
		numberOfCut = hCut + vCut;
		return numberOfCut;
	}
	private static int verticalCut(int numberOfRow, int numberOfCol) {
		int numberOfCut = 0;
		int vCut = numberOfCol - 1;
		int hCut = (numberOfRow-1)*numberOfCol;
		numberOfCut = hCut + vCut;
		return numberOfCut;
	}
}
