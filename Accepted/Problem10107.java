package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem10107 {

	public static void main(String[] args) {
		long number = 0;
		Scanner input = new Scanner(System.in);
		List<Long> numbers = new ArrayList<>();
		while(input.hasNext()) {
			number = input.nextLong();
			numbers.add(number);
			Collections.sort(numbers);
			int size = numbers.size();
			if( size % 2 == 0 ) {
				int med = size/2;
				long sum = numbers.get(med-1) + numbers.get(med);
				long median = sum/2;
				System.out.println(median);
			} else {
				int med = size/2;
				if(med != 0) {
					System.out.println(numbers.get(med));
				} else {
					System.out.println(numbers.get(med));
				}
			}
		}
		input.close();
	}

}
