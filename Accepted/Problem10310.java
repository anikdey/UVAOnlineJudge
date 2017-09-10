package easy;

import java.util.Scanner;

public class Problem10310 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			int numberOfHoles = input.nextInt();
			
			double ghopersXCoordinate = input.nextDouble();
			double ghopersYCoordinate = input.nextDouble();
			
			double dogXCoordinate = input.nextDouble();
			double dogYCoordinate = input.nextDouble();
			boolean cannotEscape = true;
			double myX = 0, myY = 0;
			
			while(numberOfHoles>=1) {
				double x2 = input.nextDouble();
				double y2 = input.nextDouble();;
				double distanceForGopher = Math.sqrt((x2-ghopersXCoordinate)*(x2-ghopersXCoordinate) + (y2-ghopersYCoordinate)*(y2-ghopersYCoordinate));
				double distanceForDog = Math.sqrt((x2-dogXCoordinate)*(x2-dogXCoordinate) + (y2-dogYCoordinate)*(y2-dogYCoordinate));
				double douForGo = distanceForGopher * 2;
				if( cannotEscape != false && distanceForDog >= douForGo ) {
					//System.out.printf("The gopher can escape through the hole at (%.3f,%.3f).\n", x2, y2);
					myX = x2;
					myY = y2;
					cannotEscape = false;
				} 
				numberOfHoles--;
			}
			if(cannotEscape) {
				System.out.printf("The gopher cannot escape.\n");
			} else {
				System.out.printf("The gopher can escape through the hole at (%.3f,%.3f).\n", myX, myY);
			}
		}
		
		input.close();
	}

}
