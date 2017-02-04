package beg;

import java.util.Scanner;

public class Problem10300 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		int counter = 0;
		
		while( counter<testCase ) {
			int totalOverhead = 0;
			int farmerCounter = 0;
			int numberOfFarmers = in.nextInt();
			while(farmerCounter<numberOfFarmers) {
				
				int sizeOfFirmYard = in.nextInt();
				int numberOfAnimal = in.nextInt();
				int environmentFriendliness = in.nextInt();
				
				int finalPremiumPerFirmer = sizeOfFirmYard * environmentFriendliness;
				totalOverhead += finalPremiumPerFirmer;
				farmerCounter++;
			}
			System.out.println(totalOverhead);
			counter++;
		}
		in.close();
	}

}
