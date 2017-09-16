package easy;

public class Problem136 {

	public static void main(String[] args) {

		int ugly[] = new int[1501], ps[] = { 1, 1, 1 }, factors[] = { 2, 3, 5 };
		ugly[1] = 1;

		for (int i = 2; i <= 1500; i++) {
			ugly[i] = Math.min(2 * ugly[ps[0]], Math.min(3 * ugly[ps[1]], 5 * ugly[ps[2]]));
			for (int j = 0; j < ps.length; j++)
				if (factors[j] * ugly[ps[j]] == ugly[i]) {
					ps[j]++;
				}
		}
		System.out.format("The 1500'th ugly number is %d.\n", ugly[1500]);
	}
}