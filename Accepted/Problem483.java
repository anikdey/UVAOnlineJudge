package easy;

import java.util.Scanner;

public class Problem483 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			String s = input.nextLine();
			String[] ar = s.split(" ");
			for(int x=0; x<ar.length; x++) {
				String cs = ar[x];
				int length = cs.length();
				for(int i=length-1; i>=0; i--) {
					System.out.print(cs.charAt(i));
				}
				if(x+1 != ar.length) {
					System.out.print(" ");
				} else if(x+1 == ar.length) {
					System.out.println();
				}
				
			}
		}
		
		input.close();

	}

}
