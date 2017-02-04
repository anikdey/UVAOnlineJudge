package beg;

import java.util.Scanner;

public class Problem272 {

	public static void main(String[] args) {
		boolean isStartingPoint = true;
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()) {
			String userString = in.nextLine();
			StringBuffer sb = new StringBuffer("");
			for(int i = 0; i<userString.length(); i++) {
				if(userString.charAt(i)== '"') {
					if(isStartingPoint) {
						sb.append("``");
						isStartingPoint = false;
					} else {
						sb.append("''");
						isStartingPoint = true;
					}
				} else {
					sb.append(userString.charAt(i));
				}
			}
			System.out.println(sb);
		}
		in.close();
	}

}
