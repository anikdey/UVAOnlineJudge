package easy;

import java.util.Scanner;

public class Problem11764 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int testCase = input.nextInt();
		int counter = 1;
		while(counter<=testCase) {
			int highJump = 0;
			int lowJump = 0;
			
			int numberOfWalls = input.nextInt();
			int[] heightOfWalls = new int[numberOfWalls];
			int currentHeight = 0;
			for(int i=0; i<numberOfWalls; i++) {
				heightOfWalls[i] = input.nextInt();
				if(i==0) {
					currentHeight = heightOfWalls[i];
				}
			}
			
			for(int i=1; i<numberOfWalls; i++) {
				
				if( currentHeight < heightOfWalls[i] ) {
					currentHeight = heightOfWalls[i];
					highJump++;
				} else if( currentHeight > heightOfWalls[i]) {
					currentHeight = heightOfWalls[i];
					lowJump++;
				}
				
			}
			System.out.println("Case "+counter+": "+highJump+" "+lowJump);
			counter++;
		}
		input.close();
	}

}
