package easy;

import java.util.Scanner;

public class Problem11547 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		
		while(testCase>0) {
			int number = input.nextInt();
			number *=567;
			number /=9;
			number +=7492;
			number *=235;
			number /=47;
			number -=498;
			
			number /=10;
			int answer = Math.abs(number%10);
			
			System.out.println(answer);
			testCase--;
		}
		input.close();
	}

}
