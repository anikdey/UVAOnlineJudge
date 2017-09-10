package easy;

import java.util.Scanner;

public class Problem488 {

	public static void main(String[] args) {
		String[] amplitudeS = {"","1","22","333","4444","55555","666666","7777777","88888888","999999999"};
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while( testCase>0 ) {
			int amplitude = input.nextInt();
			int frequency = input.nextInt();
			for( int i=1; i<=frequency; i++ ) {
				
				for(int x=1; x<=amplitude; x++) {
					System.out.print(amplitudeS[x]+"\n");
				}
				
				for(int outer = amplitude-1; outer>=1; outer--) {
					System.out.print(amplitudeS[outer]+"\n");
				}
				
				if( testCase == 1 && i==frequency ) {
					
				} else {
					System.out.println();
				}
				
			}
			testCase--;
		}
		
		input.close();
	}

}
