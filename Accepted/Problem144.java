package easy;

import java.util.Scanner;

public class Problem144 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numberOfStudents = input.nextInt();
		int lockersLimit = input.nextInt();
		
		while(numberOfStudents != 0 && lockersLimit != 0) {
			showOutGoingSerial(numberOfStudents, lockersLimit);
			numberOfStudents = input.nextInt();
			lockersLimit = input.nextInt();
		}
		input.close();
	}
	
	private static void showOutGoingSerial(int numberOfStudents, int lockersLimit) {
		int[] payables = new int[numberOfStudents];
		int[] leaves = new int[numberOfStudents];
		for(int i=0; i<numberOfStudents; i++) {
			payables[i] = 40;
		}
		int temp = numberOfStudents;
		int incrementalLimit = 1;
		int leavingIndex = 0;
		//int counter = 1;
		int access = 0;
		while(numberOfStudents > 0) {
			//System.out.println("====While Loop "+counter+"======");
			//counter++;
			myBlock:
			for(int i=0; i<temp; i++) {
				
				if(payables[i] == 0) {
					//System.out.print("Continue ");
					continue myBlock;
				}
				
				int payablesForStudent = 0;
				if(access>0) {
					payablesForStudent = payables[i] - access;
					access = 0;
				} else {
					payablesForStudent = payables[i] - incrementalLimit;
				}
				
				if(payablesForStudent<0) {
					access = Math.abs(0-payablesForStudent);
					payables[i] = 0;
					//continue myBlock;
				} else {
					payables[i] = payablesForStudent;
					//System.out.print("Payable of "+(i+1)+" is "+payables[i]+", ");	
					//System.out.print("Before Increment Value "+incrementalLimit+", ");
					if(incrementalLimit==lockersLimit) {
						incrementalLimit = 1;
					} else {
						incrementalLimit++;
					}
					//System.out.print("After Increment Value "+incrementalLimit);
					
				}
				if(payables[i] == 0) {
					leaves[leavingIndex] = i+1;
					leavingIndex++;
					numberOfStudents--;
					//System.out.print("\nStudent Added  "+(i+1)+"\n");
				}
				//System.out.println("================");
			}
			//numberOfStudents--;
		}
		//System.out.println("=======Final Result========");
		for(int i=0; i<leaves.length; i++) {
			System.out.printf("%3d", leaves[i]);
		}
		System.out.println();
	}

}
