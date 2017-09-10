package recap;

import java.util.Scanner;

public class Problem100 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			int firstInput = input.nextInt();
			int secondInput = input.nextInt();
			int from = Math.min(firstInput, secondInput);
			int to = Math.max(firstInput, secondInput);
			int maxCycle = 0;
			for( int i = from; i <= to; i++ ) {
				int tempCycle = calculateCycle(i);
				if( tempCycle >= maxCycle ) {
					maxCycle = tempCycle;
				}
			}
			System.out.println(firstInput+" "+secondInput+" "+maxCycle);
		}
		input.close();
	}
	
	public static int calculateCycle(int temp) {
		int tempCycle = 1;
		while( temp != 1 ) {
			if( temp % 2 == 1 ) {
				temp = 3 * temp + 1;
			} else {
				temp = temp / 2;
			}
			tempCycle++;
		}
		return tempCycle;
	}

}
