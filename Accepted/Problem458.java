package beg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem458 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String encodedString = null;
		while( (encodedString = bf.readLine()) != null) {
			int counter = 0;
			while(counter<encodedString.length()) {
				char ch = (char) (encodedString.charAt(counter) - 7);
				System.out.print(ch);
				counter++;
			}
			System.out.println();
		}
	}
}





