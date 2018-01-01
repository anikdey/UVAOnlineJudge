
import java.util.HashMap;
import java.util.Scanner;

public class Problem11549 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		
		while(testCase>0) {
			HashMap<Long, Integer> map = new HashMap<>();
			int displayLength = input.nextInt();
			long number = input.nextLong();
			map.put(number, 1);
			long ans = -1;
			ans = Math.max(ans, number);
			number = number * number;
			boolean val = true;
			
			
			while(val) {
				int digit = 0;
				long temp = number;
				
				while(temp!=0) {
					digit++;
					temp /= 10;
				}
				int pow = 1;
				for(int i=1; i<=digit-displayLength; i++) {
					pow *= 10;
				}
				number /= pow;
				ans = Math.max(ans, number);
				if(map.containsKey(number)) {
					System.out.println(ans);
					val = false;
				} else {
					map.put(number, 1);
					number = number*number;
				}
			}
			testCase--;
		}
		input.close();
	}
}
