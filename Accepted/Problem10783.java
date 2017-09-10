package recap;

import java.util.Scanner;

public class Problem10783 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		for(int i=1; i<=testCase; i++) {
			int from = input.nextInt();
			int to = input.nextInt();
			int sum=0;
			for(int x=from; x<=to; x++) {
				if(x%2==1) {
					sum+=x;
				}
			}
			System.out.println("Case "+i+": "+sum);
		}
		input.close();
	}

}
