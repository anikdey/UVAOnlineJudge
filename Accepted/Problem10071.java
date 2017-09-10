package recap;

import java.util.Scanner;

public class Problem10071 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int velocity = scanner.nextInt();
			int time = scanner.nextInt();
			System.out.println(velocity*time*2);
		}
		scanner.close();
	}

}
