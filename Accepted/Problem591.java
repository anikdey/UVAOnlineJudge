package beg;

import java.util.Scanner;

public class Problem591 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numberOfStacks = in.nextInt();
		int setNumber = 0;
		while( 0 != numberOfStacks ) {
			int[] arrayOfNumberOfBricksPerStack = new int[numberOfStacks];
			for(int i = 0; i<numberOfStacks; i++) {
				arrayOfNumberOfBricksPerStack[i] = in.nextInt();
			}
			setNumber++;
			System.out.println("Set #"+setNumber+"\nThe minimum number of moves is "+ calculateMinimumMovement(numberOfStacks, arrayOfNumberOfBricksPerStack)+".");
			System.out.println();
			numberOfStacks = in.nextInt();
		}
		in.close();
	}
	
	private static int calculateMinimumMovement(int numberOfStacks, int[] arrayOfNumberOfBricksPerStack) {
		int movements = 0;
		int requiredNumberOfBricksPerStack = calculateTotalNumberOfBricks(arrayOfNumberOfBricksPerStack) / numberOfStacks;
		int lenght = arrayOfNumberOfBricksPerStack.length;
		for(int i = 0; i<lenght; i++) {
			if(requiredNumberOfBricksPerStack<arrayOfNumberOfBricksPerStack[i]) {
				movements += (arrayOfNumberOfBricksPerStack[i] - requiredNumberOfBricksPerStack);
			}
		}
		return movements;
	}
	
	public static int calculateTotalNumberOfBricks(int[] arrayOfNumberOfBricksPerStack) {
		int totalNumberOfBricks = 0;
		int lenght = arrayOfNumberOfBricksPerStack.length;
		for(int i = 0; i<lenght; i++) {
			totalNumberOfBricks += arrayOfNumberOfBricksPerStack[i];
		}
		return totalNumberOfBricks;
	}

}
