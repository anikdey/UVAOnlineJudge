package beg;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10038 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			int sampleNumber = in.nextInt();
			int[] userInputs = new int[sampleNumber];
			for(int i = 0; i<sampleNumber; i++) {
				userInputs[i] = in.nextInt();
			}
			
			int[] subtractionsArray = new int[sampleNumber-1];
			
			for(int i= 0; i<sampleNumber-1; i++) {
				subtractionsArray[i] = Math.abs(userInputs[i] - userInputs[i+1]);
			}
			
			Arrays.sort(subtractionsArray);
			
			boolean flag = true;
			
			for(int i = 0; i<subtractionsArray.length; i++) {
				if(subtractionsArray[i] != i+1) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println("Jolly");
			} else {
				System.out.println("Not jolly");
			}
		}
		in.close();
	}

}
