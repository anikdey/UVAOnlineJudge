package beg;

import java.util.Scanner;

public class Problem10071 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int velocity = in.nextInt();
			int time = in.nextInt();
			System.out.println(2*velocity*time);
		}
		in.close();

	}

}



