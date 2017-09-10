package recap;

import java.util.Scanner;

public class Problem272 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//while(input.hasNextLine()) {
			String userInput = input.nextLine();
			//System.out.println(userInput);
			int length = userInput.length();
			StringBuffer sb = new StringBuffer("");
			boolean isStartingPoint = true;
			/**/
			for(int i=0; i<length; i++) {
				char currentChar = userInput.charAt(i);
				if( currentChar == '"' ) {
					if(isStartingPoint) {
						sb.append("``");
						isStartingPoint = false;
					} else {
						sb.append("''");
						isStartingPoint = true;
					}
 				} else {
 					sb.append(currentChar);
 				}
			}
			
			System.out.println(sb);
		//}
		input.close();
	}
}
