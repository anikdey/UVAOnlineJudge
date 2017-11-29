import java.util.Scanner;

public class Problem10137 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numberOfStudents = input.nextInt();
		double[] costPerStudent;
		while(numberOfStudents != 0 ) {
			double totalCost = 0;
			costPerStudent = new double[numberOfStudents];
			for( int i=0; i<numberOfStudents; i++ ) {
				double temp = input.nextDouble();
				totalCost += temp;
				costPerStudent[i] = temp;
			}

			double averageCost = totalCost/numberOfStudents;
			double positive = 0;
			double negative = 0;
			
			for( int i=0; i<numberOfStudents; i++ ) {
				double v = (long) ((costPerStudent[i] - averageCost) * 100.0) / 100.0;
				if(v > 0) positive += v;
	            else negative += v;
			}
			negative = -negative;
			System.out.printf("$%.2f\n", negative > positive? negative : positive);
			numberOfStudents = input.nextInt();
		}
		
		input.close();
	}

}
