package beg;

import java.util.Scanner;

public class Problem10783 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		int counter = 1;
		while(counter<=testCase) {
			int from = in.nextInt();
			int to = in.nextInt();
			int total = 0;
			for(int i = from; i<=to; i++) {
				if(i%2==1) {
					total += i;
				}
			}
			System.out.println("Case "+counter+": "+total);
			counter++;
		}
		in.close();
	}

}
