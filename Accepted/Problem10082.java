package easy;

import java.util.Scanner;

public class Problem10082 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			int length = line.length();
			for( int i=0; i<length; i++ ) {
				char ch = line.charAt(i);
				
				if( ch == '1' ) {
					System.out.print("`");
				} else if( ch == '2' ) {
					System.out.print("1");
				} else if( ch == '3' ) {
					System.out.print("2");
				}else if( ch == '4' ) {
					System.out.print("3");
				}else if( ch == '5' ) {
					System.out.print("4");
				}else if( ch == '6' ) {
					System.out.print("5");
				}else if( ch == '7' ) {
					System.out.print("6");
				}else if( ch == '8' ) {
					System.out.print("7");
				}else if( ch == '9' ) {
					System.out.print("8");
				}else if( ch == '0' ) {
					System.out.print("9");
				}else if( ch == '-' ) {
					System.out.print("0");
				}else if( ch == '=' ) {
					System.out.print("-");
				}else if( ch == 'W' ) {
					System.out.print("Q");
				}else if( ch == 'E' ) {
					System.out.print("W");
				}else if( ch == 'R' ) {
					System.out.print("E");
				}else if( ch == 'T' ) {
					System.out.print("R");
				}else if( ch == 'S' ) {
					System.out.print("A");
				}else if( ch == 'D' ) {
					System.out.print("S");
				}else if( ch == 'F' ) {
					System.out.print("D");
				}else if( ch == 'G' ) {
					System.out.print("F");
				}else if( ch == 'X' ) {
					System.out.print("Z");
				}else if( ch == 'C' ) {
					System.out.print("X");
				}else if( ch == 'V' ) {
					System.out.print("C");
				}else if( ch == 'B' ) {
					System.out.print("V");
				}
				
				else if(ch == 'Y') {
					System.out.print("T");
				}
				
				else if(ch == 'U') {
					System.out.print("Y");
				}
				else if(ch == 'I') {
					System.out.print("U");
				}
				else if(ch == 'O') {
					System.out.print("I");
				}
				else if(ch == 'P') {
					System.out.print("O");
				}
				else if(ch == '[') {
					System.out.print("P");
				}
				else if(ch == ']') {
					System.out.print("[");
				}
				else if(ch == ']') {
					System.out.print("\\");
				}
				else if(ch == '\\') {
					System.out.print("]");
				}
				else if(ch == 'H') {
					System.out.print("G");
				}
				else if(ch == 'J') {
					System.out.print("H");
				}
				
				
				
				else if(ch == 'K') {
					System.out.print("J");
				}
				else if(ch == 'L') {
					System.out.print("K");
				}
				else if(ch == ';') {
					System.out.print("L");
				}
				else if(ch == '\'') {
					System.out.print(";");
				}
				else if(ch == 'N') {
					System.out.print("B");
				}
				
				else if(ch == 'M') {
					System.out.print("N");
				}
				
				else if(ch == ',') {
					System.out.print("M");
				}
				else if(ch == '.') {
					System.out.print(",");
				}
				else if(ch == '/') {
					System.out.print(".");
				}
				
				else if(ch == ' ') {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		input.close();
	}

}
