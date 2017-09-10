package recap;

import java.util.Scanner;

public class Problem11172 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		for(int i=1; i<=testCase; i++) {
			int firstInput = input.nextInt();
			int secondInput = input.nextInt();
			if(firstInput>secondInput) {
				System.out.println(">");
			} else if(firstInput<secondInput) {
				System.out.println("<");
			} else {
				System.out.println("=");
			}
		}
		input.close();
	}

}
