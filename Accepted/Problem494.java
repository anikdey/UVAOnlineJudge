package beg;

import java.util.Scanner;

public class Problem494 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			int len = line.length();
			int counter = 0;
			boolean start = false;
			for(int i=0; i<len;i++){
				char ch = line.charAt(i);
				if( (ch>='a' && ch<= 'z') || (ch>= 'A' && ch<= 'Z') ) {
					if(!start) {
						counter++;
						start = true;
					}
				} else {
					start = false;
				}
			}
			System.out.println(counter);
		}
		in.close();
	}

}
