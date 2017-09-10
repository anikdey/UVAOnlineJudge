package easy;

import java.util.Scanner;

public class Problem10696 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while( input.hasNext() ) {
			int number = input.nextInt();
			if(number == 0) {
				break;
			} else {
				System.out.printf("f91(%d) = %d\n", number, f91(number));
			}
		}
		input.close();
	}
	
	private static int f91(int number) {
		if( number <= 100 ) {
			return f91(f91(number+11));
		} else {
			return number - 10;
		}
	}

}
