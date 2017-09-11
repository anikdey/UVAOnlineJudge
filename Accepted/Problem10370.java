package easy;

import java.util.Scanner;

public class Problem10370 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = 0;
		int numberOfStudents = 0;
		double[] marks;
		testCase = input.nextInt();
		while(testCase>0) {
			numberOfStudents = input.nextInt();
			marks = new double[numberOfStudents];
			for(int i=0; i<numberOfStudents; i++) {
				marks[i] = input.nextDouble();
			}
			double average = calculateAverage(marks, numberOfStudents);
			double numberOfStudentsAboveAverage = numberOfStudentsAboveAverage(marks, numberOfStudents, average);
			double percentage = (numberOfStudentsAboveAverage* 100) /(double)numberOfStudents;
			System.out.printf("%.3f%s\n",percentage, "%");
			testCase--;
		}
		
		input.close();
	}

	
	private static double calculateAverage(double[] marks, double numberOfStudents) {
		double sum = 0;
		for(int i=0; i<numberOfStudents; i++) {
			sum+=marks[i];
		}
		return sum/numberOfStudents;
	}
	
	private static double numberOfStudentsAboveAverage(double[] marks, double numberOfStudents, double average) {
		double counter = 0;
		for(int i=0; i<numberOfStudents; i++) {
			if(marks[i] > average) {
				counter++;
			}
		}
		return counter;
	}
	
}
