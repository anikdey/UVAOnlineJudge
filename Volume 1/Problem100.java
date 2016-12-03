package volumeOne;

import java.util.Scanner;

public class Problem100 {
	private static int i, j;
	public static void main(String[] args) {
		
		
		Scanner userInput = new Scanner(System.in);
		
		while(userInput.hasNextInt()){
			i = userInput.nextInt();
			j = userInput.nextInt();
			
			int counter = 0;
			int currentCycleLenght = 0;
			
			int from = Math.min(i, j);
			int to = Math.max(i, j);
			
			for(int x = from; x <= to; x++) {
				currentCycleLenght = countCycleLength(x, 1);
				if(counter < currentCycleLenght) {
					counter = currentCycleLenght;
				}
			}
			System.out.printf("%d %d %d\n", i , j, counter);
		}
		userInput.close();
	}
	
	public static int countCycleLength(int number, int lenght) {
		
		if(number>1) {
			if( number % 2 == 0 ) {
				number /= 2;
			} else {
				number = (3 * number)  + 1;
			}
			lenght++;
			return countCycleLength(number, lenght);
		} else {
			return lenght;
		}
	}
	
	
}
