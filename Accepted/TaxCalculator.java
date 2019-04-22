package introduction;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		int counter = 0;
		while(testCase != 0) {
			counter++;
			testCase--;
			double payableTax = 0;
			int totalIncome = input.nextInt();
			
			if( totalIncome > 180000 ) {
				totalIncome = totalIncome - 180000;
			} else {
				showResult(payableTax, counter);
				continue;
			}
			
			if( totalIncome > 0 ) {
				if(totalIncome>300000) {
					payableTax += 30000;
				} else {
					payableTax += (totalIncome * 0.1);
					showResult(payableTax, counter);
					continue;
				}
				totalIncome = totalIncome - 300000;
			}
			
			if( totalIncome > 0 ) {
				if(totalIncome>400000) {
					payableTax += 60000;
				} else {
					payableTax += (totalIncome * 0.15);
					showResult(payableTax, counter);
					continue;
				}
				totalIncome = totalIncome - 400000;
			}
			
			if( totalIncome > 0 ) {
				if(totalIncome>300000) {
					payableTax += 60000;
				} else {
					payableTax += (totalIncome * 0.2);
					showResult(payableTax, counter);
					continue;
				}
				totalIncome = totalIncome - 300000;
			}
			
			if( totalIncome > 0 ) {
				payableTax += (totalIncome * 0.25);
				showResult(payableTax, counter);
			}
		}
		input.close();
	}
	
	
	private static void showResult(double payableTax, int counter) {
		if( payableTax == 0 ) {
			System.out.println("Case "+counter+": 0");
		} else if( payableTax < 2000 ) {
			System.out.println("Case "+counter+": 2000");
		}else {
			int result = (int) Math.ceil(payableTax);
			System.out.println("Case "+counter+": "+result);
		}
	}
}
